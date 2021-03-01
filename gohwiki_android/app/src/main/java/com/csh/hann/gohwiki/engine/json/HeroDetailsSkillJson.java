package com.csh.hann.gohwiki.engine.json;

import com.csh.hann.gohwiki.engine.entities.HeroDetailsSkill;

import java.util.List;

public class HeroDetailsSkillJson {
    private List<HeroDetailsSkill> heroDetailsSkills;

    public HeroDetailsSkillJson() {
    }

    public HeroDetailsSkillJson(List<HeroDetailsSkill> heroDetailsSkills) {
        this.heroDetailsSkills = heroDetailsSkills;
    }

    public List<HeroDetailsSkill> getHeroDetailsSkills() {
        return heroDetailsSkills;
    }

    public void setHeroDetailsSkills(List<HeroDetailsSkill> heroDetailsSkills) {
        this.heroDetailsSkills = heroDetailsSkills;
    }
}
