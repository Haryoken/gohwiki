package com.csh.hann.gohwiki.engine.util;

import android.content.Context;

import com.csh.hann.gohwiki.engine.entities.*;

public class DataLoaderVie extends DataLoader {
    private static String FILE_DIRECTORY = "src/main/resources/data/json/vi/";
    private static String SKILL_TYPE_FILE_NAME = "skillType_vi.json";
    public DataLoaderVie(Context context) {
        super(context);
    }

    public DataLoaderVie(Data data, Context context) {
        super(data, context);
    }


}
