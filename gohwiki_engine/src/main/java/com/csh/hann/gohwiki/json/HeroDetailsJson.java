package com.csh.hann.gohwiki.json;

import com.csh.hann.gohwiki.entities.HeroDetails;

import java.util.List;

public class HeroDetailsJson {
    private List<HeroDetails> heroDetails;

    public HeroDetailsJson() {
    }

    public HeroDetailsJson(List<HeroDetails> heroDetails) {
        this.heroDetails = heroDetails;
    }

    public List<HeroDetails> getHeroDetails() {
        return heroDetails;
    }

    public void setHeroDetails(List<HeroDetails> heroDetails) {
        this.heroDetails = heroDetails;
    }
}
