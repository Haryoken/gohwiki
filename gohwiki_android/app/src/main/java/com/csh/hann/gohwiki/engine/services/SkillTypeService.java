package com.csh.hann.gohwiki.engine.services;

import com.csh.hann.gohwiki.engine.entities.SkillType;

import java.util.List;

public class SkillTypeService {
    private List<SkillType> skillTypeList;

    public SkillTypeService(List<SkillType> skillTypeList) {
        this.skillTypeList = skillTypeList;
    }

    public List<SkillType> getSkillTypeList() {
        return skillTypeList;
    }

    public void setSkillTypeList(List<SkillType> skillTypeList) {
        this.skillTypeList = skillTypeList;
    }

    public SkillType findById(String id){
        for (SkillType skillType:skillTypeList) {
            if(skillType.getId().equals(id)){
                return skillType;
            }
        }
        return null;
    }
}
