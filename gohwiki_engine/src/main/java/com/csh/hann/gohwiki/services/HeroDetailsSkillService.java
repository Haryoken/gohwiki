package com.csh.hann.gohwiki.services;

import com.csh.hann.gohwiki.entities.HeroDetails;
import com.csh.hann.gohwiki.entities.HeroDetailsSkill;
import com.csh.hann.gohwiki.entities.Skill;
import com.csh.hann.gohwiki.enums.HeroDetailsSkillSearchMode;

import java.util.ArrayList;
import java.util.List;

public class HeroDetailsSkillService {
    private List<HeroDetailsSkill> heroDetailsSkillList;

    public HeroDetailsSkillService(List<HeroDetailsSkill> heroDetailsSkillList) {
        this.heroDetailsSkillList = heroDetailsSkillList;
    }

    public List<HeroDetailsSkill> getHeroDetailsSkillList() {
        return heroDetailsSkillList;
    }

    public void setHeroDetailsSkillList(List<HeroDetailsSkill> heroDetailsSkillList) {
        this.heroDetailsSkillList = heroDetailsSkillList;
    }

    public List<HeroDetailsSkill> findByHeroDetails(HeroDetails heroDetails){
        List<HeroDetailsSkill> HDSList  = new ArrayList<>();
        for (HeroDetailsSkill heroDetailSkill: heroDetailsSkillList) {
            if(heroDetailSkill.getHeroDetailsId().equals(heroDetails.getId())){
                HDSList.add(heroDetailSkill);
            }
        }
        return HDSList;
    }

    public List<HeroDetailsSkill> findByHeroSkill(Skill skill){
        List<HeroDetailsSkill> HDSList  = new ArrayList<>();
        for (HeroDetailsSkill heroDetailSkill: heroDetailsSkillList) {
            if(heroDetailSkill.getSkillId().equals(skill.getId())){
                HDSList.add(heroDetailSkill);
            }
        }
        return HDSList;
    }
}
