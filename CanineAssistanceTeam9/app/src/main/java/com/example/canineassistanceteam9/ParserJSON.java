package com.example.canineassistanceteam9;

// Java program to read JSON from a file

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.Map;

public class ParserJSON
{
    public JSONObject getQuestionInfo(String q) throws Exception
    {
        JSONObject jo = new JSONObject("raw/questions.json");
        JSONObject questions = jo.getJSONObject("questions");
        return questions.getJSONObject(q);
    }
}

