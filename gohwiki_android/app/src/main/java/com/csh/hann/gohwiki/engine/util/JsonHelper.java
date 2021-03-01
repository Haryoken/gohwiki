package com.csh.hann.gohwiki.engine.util;



import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonHelper<T> {

    public static JSONObject readJsonFromFile(String fileName){
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(fileName))
        {
            //Read JSON file
            return (JSONObject)jsonParser.parse(reader);


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
