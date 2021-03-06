package com.csh.hann.gohwiki.engine.services;

import com.csh.hann.gohwiki.engine.entities.Party;
import com.csh.hann.gohwiki.engine.entities.SkillType;

import java.util.List;

public class PartyService {
    private List<Party> partyList;

    public PartyService(List<Party> partyList) {
        this.partyList = partyList;
    }

    public List<Party> getPartyList() {
        return partyList;
    }

    public void setPartyList(List<Party> partyList) {
        this.partyList = partyList;
    }

    public Party findById(String id){
        for (Party party:partyList) {
            if(party.getId().equals(id)){
                return party;
            }
        }
        return null;
    }
}
