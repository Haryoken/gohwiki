package com.csh.hann.gohwiki.object;

import com.csh.hann.gohwiki.dto.CharacterDTO;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.List;

public class CharacterJson {
    private List<CharacterDTO> characters;

    public CharacterJson() {
    }

    public CharacterJson(List<CharacterDTO> characters) {
        this.characters = characters;
    }

    public List<CharacterDTO> getCharacters() {
        return characters;
    }
    @JsonAnySetter
    public void setCharacters(List<CharacterDTO> characters) {
        this.characters = characters;
    }
}
