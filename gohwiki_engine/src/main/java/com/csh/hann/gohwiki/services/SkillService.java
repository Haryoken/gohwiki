package com.csh.hann.gohwiki.services;

import com.csh.hann.gohwiki.entities.Hero;
import com.csh.hann.gohwiki.entities.Skill;

import java.util.List;

public class SkillService {
    private List<Skill> skillList;

    public SkillService(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public Skill findById(String id) {
        for (Skill skill : skillList) {
            if (skill.getId().equals(id)) {
                return skill;
            }
        }
        return null;
    }
}
