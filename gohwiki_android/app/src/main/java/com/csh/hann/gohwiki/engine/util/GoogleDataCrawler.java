package com.csh.hann.gohwiki.engine.util;

import com.csh.hann.gohwiki.engine.enums.Language;
import com.csh.hann.gohwiki.engine.dto.CharacterDTO;
import com.csh.hann.gohwiki.engine.object.CharacterJson;
import org.json.simple.JSONObject;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import java.io.IOException;
import java.util.List;

public class GoogleDataCrawler {
    private static String NAME_VIE_H2_CLASS = "rhscol rhstc4";
    private List<CharacterDTO> characters;
    private String charName = "charNamePlaceHolder";
    private String language = "en";
//    private String site = "https://www.google.com/search?sxsrf=ALeKk0287uT14x2WUmFg7lEZfM_645q3FQ%3A1609830122143" +
//            "&source=hp&ei%20//%20=6g70X97cBoGortoP_d-OmAg&q="+charName+"&oq="+charName+"&gs_lcp" +
//        "=CgZwc3ktYWIQA1DsBFjsBGC%20//%20-B2gAcAB4AIABAIgBAJIBAJgBAKABAqABAaoBB2d3cy13aXo&sclient=psy-ab&ved=0ahUKEwje-c7EnITuAhUBlEsFHf2vA4MQ4dUDCAc&uact=5";
    private String site = "https://translate.google.com/?sl=auto&tl="+language+"&text="+charName+"&op=translate";
    public GoogleDataCrawler(){
        initHeroList();
    }
    public void initHeroList(){
        //read heroes from files
        JSONObject jsonObject = JsonHelper.readJsonFromFile("src/main/resources/data/json/character.json");
        JsonHelper<CharacterJson> charJsonHelper =  new JsonHelper<>();
        CharacterJson characterJson = charJsonHelper.objectMapping(jsonObject,CharacterJson.class);
        this.characters = characterJson.getCharacters();
    }

    public void crawlHeroName(String name, Language lang){
        setCharName(name);
        setLanguage(lang.toString());
        try{
            Document document = JsoupHelper.connect(site);
            System.out.println(document.toString());
            Elements elements = document.getElementsByClass("JLqJ4b");
            System.out.println("");
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

    public List<CharacterDTO> getCharacters() {
        return characters;
    }

    public void setCharacters(List<CharacterDTO> characters) {
        this.characters = characters;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
