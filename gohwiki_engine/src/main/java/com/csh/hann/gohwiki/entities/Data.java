package com.csh.hann.gohwiki.entities;

import java.util.List;

public class Data {
    private List<SkillType> skillTypeList;
    private List<Party> partyList;
    private List<Skill> skillList;
    private List<Hero> heroList;
    private List<HeroDetails> heroDetails;
    private List<HeroDetailsSkill> heroDetailsSkills;

    public Data() {
    }

    public Data(List<SkillType> skillTypeList, List<Party> partyList, List<Skill> skillList, List<Hero> heroList,
                List<HeroDetails> heroDetails,List<HeroDetailsSkill> heroDetailsSkills) {
        this.skillTypeList = skillTypeList;
        this.partyList = partyList;
        this.skillList = skillList;
        this.heroList = heroList;
        this.heroDetails = heroDetails;
        this.heroDetailsSkills = heroDetailsSkills;
    }

    public List<SkillType> getSkillTypeList() {
        return skillTypeList;
    }

    public void setSkillTypeList(List<SkillType> skillTypeList) {
        this.skillTypeList = skillTypeList;
    }

    public List<Party> getPartyList() {
        return partyList;
    }

    public void setPartyList(List<Party> partyList) {
        this.partyList = partyList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Hero> getHeroList() {
        return heroList;
    }

    public void setHeroList(List<Hero> heroList) {
        this.heroList = heroList;
    }

    public List<HeroDetails> getHeroDetails() {
        return heroDetails;
    }

    public void setHeroDetails(List<HeroDetails> heroDetails) {
        this.heroDetails = heroDetails;
    }

    public List<HeroDetailsSkill> getHeroDetailsSkills() {
        return heroDetailsSkills;
    }

    public void setHeroDetailsSkills(List<HeroDetailsSkill> heroDetailsSkills) {
        this.heroDetailsSkills = heroDetailsSkills;
    }
}
