package com.csh.hann.gohwiki.engine.json;

import com.csh.hann.gohwiki.engine.entities.Hero;

import java.util.List;

public class HeroJson {
    private List<Hero> heroList;

    public HeroJson() {
    }

    public HeroJson(List<Hero> heroList) {
        this.heroList = heroList;
    }

    public List<Hero> getHeroList() {
        return heroList;
    }

    public void setHeroList(List<Hero> heroList) {
        this.heroList = heroList;
    }
}
