package com.csh.hann.gohwiki.entities;

public class HeroDetailsSkill {
    private String heroDetailsId;
    private String skillId;

    public HeroDetailsSkill() {
    }

    public HeroDetailsSkill(String heroDetailsId, String skillId) {
        this.heroDetailsId = heroDetailsId;
        this.skillId = skillId;
    }

    public String getHeroDetailsId() {
        return heroDetailsId;
    }

    public void setHeroDetailsId(String heroDetailsId) {
        this.heroDetailsId = heroDetailsId;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }
}
