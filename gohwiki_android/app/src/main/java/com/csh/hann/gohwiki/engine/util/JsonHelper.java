package com.csh.hann.gohwiki.engine.util;



import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JsonHelper<T> {
    public static JSONObject readJsonFromFile(String fileName){
        return null;
    }
        private static final String DATA_FOLDER = "raw";
        public static JSONObject readJsonFromFile(String fileName, Context context){
        JSONParser jsonParser = new JSONParser();

        try {
            Resources res = context.getResources();
            InputStream fis = res.openRawResource(res.getIdentifier(fileName,DATA_FOLDER,context.getPackageName()));
            BufferedReader bfr = new BufferedReader(new InputStreamReader(fis));
            //Read JSON file

            return (JSONObject)jsonParser.parse(bfr);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public T objectMapping(JSONObject obj, Class<T> clazz)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return objectMapper.readValue(obj.toJSONString(),clazz);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return null;
    }

}
