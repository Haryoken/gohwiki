package com.csh.hann.gohwiki.services;

import com.csh.hann.gohwiki.entities.*;

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
