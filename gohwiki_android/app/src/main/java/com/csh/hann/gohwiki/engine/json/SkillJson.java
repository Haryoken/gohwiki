package com.csh.hann.gohwiki.engine.json;

import com.csh.hann.gohwiki.engine.entities.Skill;

import java.util.List;

public class SkillJson {
    private List<Skill> skillList;

    public SkillJson() {
    }

    public SkillJson(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }
}
