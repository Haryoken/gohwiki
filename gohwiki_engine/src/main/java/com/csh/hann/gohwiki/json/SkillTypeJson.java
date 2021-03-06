package com.csh.hann.gohwiki.json;

import com.csh.hann.gohwiki.entities.SkillType;

import java.util.List;

public class SkillTypeJson {
    private List<SkillType> skillTypeList;

    public SkillTypeJson() {
    }

    public SkillTypeJson(List<SkillType> skillTypeList) {
        this.skillTypeList = skillTypeList;
    }

    public List<SkillType> getSkillTypeList() {
        return skillTypeList;
    }

    public void setSkillTypeList(List<SkillType> skillTypeList) {
        this.skillTypeList = skillTypeList;
    }
}
