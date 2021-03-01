package com.csh.hann.gohwiki.engine.enums;

public enum Language {
    VI("vi"),
    EN("en")
    ;
    private String value;

    Language(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
