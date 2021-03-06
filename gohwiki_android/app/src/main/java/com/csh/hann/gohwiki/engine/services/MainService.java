package com.csh.hann.gohwiki.engine.services;

import android.content.Context;

import com.csh.hann.gohwiki.engine.entities.*;
import com.csh.hann.gohwiki.engine.enums.Language;
import com.csh.hann.gohwiki.engine.util.DataLoader;

import java.util.ArrayList;
import java.util.List;

public class MainService {

    private PartyService partyService;
    private SkillTypeService skillTypeService;
    private SkillService skillService;
    private HeroService heroService;
    private HeroDetailsService heroDetailsService;
    private HeroDetailsSkillService heroDetailsSkillService;

    public MainService(PartyService partyService, SkillTypeService skillTypeService, SkillService skillService,
                       HeroService heroService, HeroDetailsService heroDetailsService, HeroDetailsSkillService heroDetailsSkillService) {
        this.partyService = partyService;
        this.skillTypeService = skillTypeService;
        this.skillService = skillService;
        this.heroService = heroService;
        this.heroDetailsService = heroDetailsService;
        this.heroDetailsSkillService = heroDetailsSkillService;
    }

    public MainService(Language language, Context context){
        DataLoader dataLoader = new DataLoader(context);
        Data data = dataLoader.loadData(language);

        PartyService partyService = new PartyService(data.getPartyList());
        HeroService heroService = new HeroService(data.getHeroList());
        SkillTypeService skillTypeService = new SkillTypeService(data.getSkillTypeList());
        SkillService skillService = new SkillService(data.getSkillList());
        HeroDetailsService heroDetailsService = new HeroDetailsService(data.getHeroDetails());
        HeroDetailsSkillService heroDetailsSkillService = new HeroDetailsSkillService(data.getHeroDetailsSkills());

        this.partyService = partyService;
        this.skillTypeService = skillTypeService;
        this.skillService = skillService;
        this.heroService = heroService;
        this.heroDetailsService = heroDetailsService;
        this.heroDetailsSkillService = heroDetailsSkillService;
    }

    public HeroDetails getHeroDetailsByHRId(String hrId){
        HeroDetails heroDetails = heroDetailsService.findById(hrId);
        this.finalizeHRData(heroDetails);
        return heroDetails;
    }

    public List<HeroDetails> getHeroDetailsBySkillId(String skillId){
        Skill skill = skillService.findById(skillId);
        List<HeroDetailsSkill> heroDetailsSkillList = heroDetailsSkillService.findByHeroSkill(skill);
        List<HeroDetails> heroDetailsList = new ArrayList<>();
        for (HeroDetailsSkill heroDetailsSkill: heroDetailsSkillList) {
            HeroDetails heroDetails = heroDetailsService.findById(heroDetailsSkill.getHeroDetailsId());
            this.finalizeHRData(heroDetails);
            heroDetailsList.add(heroDetails);
        }
        return heroDetailsList;
    }

    public List<HeroDetails> getHeroDetailsByPartyId(String partyId){
        Party party = partyService.findById(partyId);
        List<HeroDetails> heroDetailsList = heroDetailsService.findByParty(party);
        for (HeroDetails herodetails: heroDetailsList ){
            this.finalizeHRData(herodetails);
        }
        return heroDetailsList;
    }

    public List<Hero> getAllHeroes(){
        return heroService.getHeroList();
    }

    private HeroDetails finalizeHRData(HeroDetails heroDetails){
        this.getHeroInfoByHRId(heroDetails);
        this.getPartyByHDId(heroDetails);
        this.getSkillByHDId(heroDetails);
        return heroDetails;
    }
    private HeroDetails getSkillByHDId(HeroDetails heroDetails){

        List<HeroDetailsSkill> heroDetailsSkills = heroDetailsSkillService.findByHeroDetails(heroDetails);

        List<Skill> skillList = new ArrayList<>();
        for (HeroDetailsSkill heroSkill: heroDetailsSkills) {
            Skill skill = skillService.findById(heroSkill.getSkillId());
            this.getSkillTypeByTypeId(skill);
            skillList.add(skill);
        }

        heroDetails.setSkillList(skillList);
        return heroDetails;

    }

    private Skill getSkillTypeByTypeId(Skill skill){
        SkillType skillType = skillTypeService.findById(skill.getTypeId());
        skill.setSkillType(skillType);
        return  skill;
    }
    private HeroDetails getPartyByHDId(HeroDetails heroDetails){
        Party party = partyService.findById(heroDetails.getPartyId());
        heroDetails.setParty(party);
        return heroDetails;
    }

    private HeroDetails getHeroInfoByHRId(HeroDetails heroDetails){
        Hero hero = heroService.findById(heroDetails.getHeroId());
        heroDetails.setHero(hero);
        return heroDetails;
    }


}
