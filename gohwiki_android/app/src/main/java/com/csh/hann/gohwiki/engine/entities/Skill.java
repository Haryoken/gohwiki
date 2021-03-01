package com.csh.hann.gohwiki.engine.entities;

public class Skill {
    private String id;
    private String name;
    private String typeId;
    private String description;


    private SkillType skillType;

    public Skill() {
    }

    public Skill(String id, String name, String typeId, String description, SkillType skillType) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.description = description;
        this.skillType = skillType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }
}
