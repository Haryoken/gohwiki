package com.csh.hann.gohwiki.engine.json;

import com.csh.hann.gohwiki.engine.entities.Party;

import java.util.List;

public class PartyJson {
    private List<Party> partyList;

    public PartyJson() {
    }

    public PartyJson(List<Party> partyList) {
        this.partyList = partyList;
    }

    public List<Party> getPartyList() {
        return partyList;
    }

    public void setPartyList(List<Party> partyList) {
        this.partyList = partyList;
    }
}
