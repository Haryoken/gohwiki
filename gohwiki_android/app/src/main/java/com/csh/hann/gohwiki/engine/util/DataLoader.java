package com.csh.hann.gohwiki.engine.util;

import com.csh.hann.gohwiki.engine.entities.Data;
import com.csh.hann.gohwiki.engine.entities.Hero;
import com.csh.hann.gohwiki.engine.entities.HeroDetails;
import com.csh.hann.gohwiki.engine.entities.HeroDetailsSkill;
import com.csh.hann.gohwiki.engine.entities.Party;
import com.csh.hann.gohwiki.engine.entities.Skill;
import com.csh.hann.gohwiki.engine.entities.SkillType;
import com.csh.hann.gohwiki.engine.enums.Language;
import com.csh.hann.gohwiki.engine.json.HeroDetailsJson;
import com.csh.hann.gohwiki.engine.json.HeroDetailsSkillJson;
import com.csh.hann.gohwiki.engine.json.HeroJson;
import com.csh.hann.gohwiki.engine.json.PartyJson;
import com.csh.hann.gohwiki.engine.json.SkillJson;
import com.csh.hann.gohwiki.engine.json.SkillTypeJson;


import org.json.simple.JSONObject;

import java.util.List;

public class DataLoader {
    private static String FILE_DIRECTORY = "src/main/resources/data/json/";
    private static String JSON_EXTENSION = ".json";
    private static String SKILL_TYPE_FILE_NAME = "skillType";
    private static String PARTY_FILE_NAME = "party";
    private static String HERO_FILE_NAME = "hero";
    private static String SKILL_FILE_NAME = "skill";
    private static String HERO_DETAILS_FILE_NAME = "heroDetails";
    private static String HERO_DETAILS_SKILL_FILE_NAME = "heroDetailsSkill";
    protected Data data;

    public DataLoader() {
        this.data = new Data();
    }

    public DataLoader(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data loadData(Language language) {
        List<SkillType> skillTypeList = this.loadSkillType(language);
        List<Party> partyList = this.loadParty(language);
        List<Hero> heroList = this.loadHero(language);
        List<Skill> skillList = this.loadSkill(language);
        List<HeroDetails> heroDetails = this.loadHeroDetails(language);
        List<HeroDetailsSkill> heroDetailsSkills = this.loadHeroDetailsSkill(language);

        data.setSkillTypeList(skillTypeList);
        data.setSkillList(skillList);
        data.setHeroList(heroList);
        data.setPartyList(partyList);
        data.setHeroDetails(heroDetails);
        data.setHeroDetailsSkills(heroDetailsSkills);
        return data;
    }

    private String getNameFile(String fileName,Language lang){
        fileName = FILE_DIRECTORY + lang.getValue() + "/" +fileName+"_"+lang.getValue()+JSON_EXTENSION;
        return  fileName;
    }
    protected List<SkillType> loadSkillType(Language lang) {
        String fileName = getNameFile(SKILL_TYPE_FILE_NAME,lang);
        JSONObject jsonObject = JsonHelper.readJsonFromFile(fileName);
        JsonHelper<SkillTypeJson> jsonHelper = new JsonHelper<>();
        SkillTypeJson skillTypeJson = jsonHelper.objectMapping(jsonObject,SkillTypeJson.class);
        List<SkillType> skillTypeList = skillTypeJson.getSkillTypeList();
        return skillTypeList;
    }

    protected List<Party> loadParty(Language lang) {
        String fileName = getNameFile(PARTY_FILE_NAME,lang);
        JSONObject jsonObject = JsonHelper.readJsonFromFile(fileName);
        JsonHelper<PartyJson> jsonHelper = new JsonHelper<>();
        PartyJson partyJson = jsonHelper.objectMapping(jsonObject,PartyJson.class);
        List<Party> partyList = partyJson.getPartyList();
        return partyList;
    }

    protected List<Hero> loadHero(Language lang) {
        String fileName = getNameFile(HERO_FILE_NAME,lang);
        JSONObject jsonObject = JsonHelper.readJsonFromFile(fileName);
        JsonHelper<HeroJson> jsonHelper = new JsonHelper<>();
        HeroJson heroJson = jsonHelper.objectMapping(jsonObject,HeroJson.class);
        List<Hero> partyList = heroJson.getHeroList();
        return partyList;
    }

    protected List<Skill> loadSkill(Language lang) {
        String fileName = getNameFile(SKILL_FILE_NAME,lang);
        JSONObject jsonObject = JsonHelper.readJsonFromFile(fileName);
        JsonHelper<SkillJson> jsonHelper = new JsonHelper<>();
        SkillJson skillJson = jsonHelper.objectMapping(jsonObject,SkillJson.class);
        List<Skill> partyList = skillJson.getSkillList();
        return partyList;
    }

    protected List<HeroDetails> loadHeroDetails(Language lang) {
        String fileName = getNameFile(HERO_DETAILS_FILE_NAME,lang);
        JSONObject jsonObject = JsonHelper.readJsonFromFile(fileName);
        JsonHelper<HeroDetailsJson> jsonHelper = new JsonHelper<>();
        HeroDetailsJson heroDetailsJson = jsonHelper.objectMapping(jsonObject,HeroDetailsJson.class);
        List<HeroDetails> partyList = heroDetailsJson.getHeroDetails();
        return partyList;
    }

    protected List<HeroDetailsSkill> loadHeroDetailsSkill(Language lang) {
        String fileName = getNameFile(HERO_DETAILS_SKILL_FILE_NAME,lang);
        JSONObject jsonObject = JsonHelper.readJsonFromFile(fileName);
        JsonHelper<HeroDetailsSkillJson> jsonHelper = new JsonHelper<>();
        HeroDetailsSkillJson heroDetailsSkillJson = jsonHelper.objectMapping(jsonObject,HeroDetailsSkillJson.class);
        List<HeroDetailsSkill> heroDetailsSkillsList = heroDetailsSkillJson.getHeroDetailsSkills();
        return heroDetailsSkillsList;
    }
}
