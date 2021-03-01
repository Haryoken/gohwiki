package com.csh.hann.gohwiki;

import com.csh.hann.gohwiki.entities.Data;
import com.csh.hann.gohwiki.entities.HeroDetails;
import com.csh.hann.gohwiki.enums.Language;
import com.csh.hann.gohwiki.services.*;
import com.csh.hann.gohwiki.util.DataLoader;

import java.util.List;

public class Test {
    public static void main (String[] agrs) {
        DataLoader dataLoader = new DataLoader();
        Data data = dataLoader.loadData(Language.VI);

        PartyService partyService = new PartyService(data.getPartyList());
        HeroService heroService = new HeroService(data.getHeroList());
        SkillTypeService skillTypeService = new SkillTypeService(data.getSkillTypeList());
        SkillService skillService = new SkillService(data.getSkillList());
        HeroDetailsService heroDetailsService = new HeroDetailsService(data.getHeroDetails());
        HeroDetailsSkillService heroDetailsSkillService = new HeroDetailsSkillService(data.getHeroDetailsSkills());

        MainService mainService = new MainService(partyService,skillTypeService,skillService,heroService,
                heroDetailsService,heroDetailsSkillService);

        HeroDetails heroDetails = mainService.getHeroDetailsByHRId("01010001");
        List<HeroDetails> heroDetailsListBySkill = mainService.getHeroDetailsBySkillId("01001");
        List<HeroDetails> heroDetailsListByParty = mainService.getHeroDetailsByPartyId("01");
        System.out.println(heroDetails);

    }
}
