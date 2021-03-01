package com.csh.hann.gohwiki.services;

import com.csh.hann.gohwiki.entities.Hero;
import com.csh.hann.gohwiki.entities.Party;

import java.util.List;

public class HeroService {
    private List<Hero> heroList;

    public HeroService(List<Hero> heroList) {
        this.heroList = heroList;
    }

    public List<Hero> getHeroList() {
        return heroList;
    }

    public void setHeroList(List<Hero> heroList) {
        this.heroList = heroList;
    }

    public Hero findById(String id) {
        for (Hero hero : heroList) {
            if (hero.getId().equals(id)) {
                return hero;
            }
        }
        return null;
    }

}
