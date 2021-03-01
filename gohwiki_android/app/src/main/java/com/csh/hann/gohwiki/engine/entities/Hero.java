package com.csh.hann.gohwiki.engine.entities;

public class Hero {
    private String id;
    private String name;
    private String title;
    private String gender;

    public Hero() {
    }

    public Hero(String id, String name, String title, String gender) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
