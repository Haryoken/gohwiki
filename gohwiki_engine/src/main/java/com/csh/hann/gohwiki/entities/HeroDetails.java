package com.csh.hann.gohwiki.entities;

import java.util.List;

public class HeroDetails {
    private String id;
    private String heroId;
    private String partyId;
    private boolean emperor;
    private String type;
    private String hp;
    private String skillId1;
    private String skillId2;
    private String skillId3;
    private String skillId4;
    private String skillId5;

    private Hero hero;
    private Party party;
    private List<Skill> skillList;

    public HeroDetails() {
    }

    public HeroDetails(String id, String heroId, String partyId, boolean emperor, String type, String hp,
                       String skillId1, String skillId2, String skillId3, String skillId4, String skillId5) {
        this.id = id;
        this.heroId = heroId;
        this.partyId = partyId;
        this.emperor = emperor;
        this.type = type;
        this.hp = hp;
        this.skillId1 = skillId1;
        this.skillId2 = skillId2;
        this.skillId3 = skillId3;
        this.skillId4 = skillId4;
        this.skillId5 = skillId5;
    }

    public HeroDetails(String id, boolean emperor, String type, String hp, Hero hero, Party party, List<Skill> skillList) {
        this.id = id;
        this.emperor = emperor;
        this.type = type;
        this.hp = hp;
        this.hero = hero;
        this.party = party;
        this.skillList = skillList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeroId() {
        return heroId;
    }

    public void setHeroId(String heroId) {
        this.heroId = heroId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public boolean isEmperor() {
        return emperor;
    }

    public void setEmperor(boolean emperor) {
        this.emperor = emperor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getSkillId1() {
        return skillId1;
    }

    public void setSkillId1(String skillId1) {
        this.skillId1 = skillId1;
    }

    public String getSkillId2() {
        return skillId2;
    }

    public void setSkillId2(String skillId2) {
        this.skillId2 = skillId2;
    }

    public String getSkillId3() {
        return skillId3;
    }

    public void setSkillId3(String skillId3) {
        this.skillId3 = skillId3;
    }

    public String getSkillId4() {
        return skillId4;
    }

    public void setSkillId4(String skillId4) {
        this.skillId4 = skillId4;
    }

    public String getSkillId5() {
        return skillId5;
    }

    public void setSkillId5(String skillId5) {
        this.skillId5 = skillId5;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }
}
