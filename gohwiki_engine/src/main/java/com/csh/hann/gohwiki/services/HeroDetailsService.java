package com.csh.hann.gohwiki.services;

import com.csh.hann.gohwiki.entities.HeroDetails;
import com.csh.hann.gohwiki.entities.Party;

import java.util.ArrayList;
import java.util.List;

public class HeroDetailsService {
    private List<HeroDetails> heroDetails;

    public HeroDetailsService(List<HeroDetails> heroDetails) {
        this.heroDetails = heroDetails;
    }

    public List<HeroDetails> getHeroDetails() {
        return heroDetails;
    }

    public void setHeroDetails(List<HeroDetails> heroDetails) {
        this.heroDetails = heroDetails;
    }

    public HeroDetails findById(String id){
        for (HeroDetails heroDetail: heroDetails) {
            if(heroDetail.getId().equals(id)){
                return  heroDetail;
            }
        }
        return null;
    }

    public List<HeroDetails> findByParty(Party party){
        List<HeroDetails> heroDetailsList = new ArrayList<>();
        for (HeroDetails heroDetail: heroDetails) {
            if(heroDetail.getPartyId().equals(party.getId())){
                heroDetailsList.add(heroDetail);
            }
        }
        return heroDetailsList;
    }
}
