package com.csh.hann.gohwiki.dto;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class CharacterDTO {
    private int id;
    private String name;
    private int ex;
    private int avtid;
    private int skinParent;
    private int country;
    private int sex;
    private int life;
    private int defaults;
    private int vip;
    private int spell1;
    private int spell2;
    private int spell3;
    private int spell4;
    private int spell5;
    public CharacterDTO() {}
    public CharacterDTO(int id, String name, int avtid, int ex, int country, int sex, int life, int skinParent,
                        int defaults,int vip,int spell1, int spell2, int spell3, int spell4, int spell5) {
        this.id = id;
        this.name = name;
        this.avtid = avtid;
        this.ex = ex;
        this.country = country;
        this.sex = sex;
        this.life = life;
        this.skinParent = skinParent;
        this.defaults = defaults;
        this.vip = vip;
        this.spell1 = spell1;
        this.spell2 = spell2;
        this.spell3 = spell3;
        this.spell4 = spell4;
        this.spell5 = spell5;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvtid() {
        return avtid;
    }

    public void setAvtid(int avtid) {
        this.avtid = avtid;
    }

    public int getEx() {
        return ex;
    }

    public void setEx(int ex) {
        this.ex = ex;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSkinParent() {
        return skinParent;
    }

    public void setSkinParent(int skinParent) {
        this.skinParent = skinParent;
    }

    public int getDefaults() {
        return defaults;
    }

    public void setDefaults(int defaults) {
        this.defaults = defaults;
    }

    public int getVip() {
        return vip;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }

    public int getSpell1() {
        return spell1;
    }

    public void setSpell1(int spell1) {
        this.spell1 = spell1;
    }

    public int getSpell2() {
        return spell2;
    }

    public void setSpell2(int spell2) {
        this.spell2 = spell2;
    }

    public int getSpell3() {
        return spell3;
    }

    public void setSpell3(int spell3) {
        this.spell3 = spell3;
    }

    public int getSpell4() {
        return spell4;
    }

    public void setSpell4(int spell4) {
        this.spell4 = spell4;
    }

    public int getSpell5() {
        return spell5;
    }

    public void setSpell5(int spell5) {
        this.spell5 = spell5;
    }



}
