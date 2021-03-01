package com.csh.hann.gohwiki.util;

import com.csh.hann.gohwiki.entities.*;

import java.util.List;

public class DataLoaderVie extends DataLoader {
    private static String FILE_DIRECTORY = "src/main/resources/data/json/vi/";
    private static String SKILL_TYPE_FILE_NAME = "skillType_vi.json";
    public DataLoaderVie() {
        super();
    }

    public DataLoaderVie(Data data) {
        super(data);
    }


}
