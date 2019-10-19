package com.example.canineassistanceteam9;

import android.util.Log;

import org.json.JSONObject;

import static androidx.constraintlayout.widget.Constraints.TAG;


public class ParserJSON
{
    public  static JSONObject getQuestionInfo(String q)
    {
        try {
            JSONObject jo = new JSONObject("raw/questions.json");
            JSONObject questions = jo.getJSONObject("questions");
            return questions.getJSONObject(q);
        }
        catch(Exception e)
        {
            Log.d(TAG, e.toString());
        }
        return null;
    }

    public static String getQuestionDesc(String q)
    {
        try{
        JSONObject question = getQuestionInfo(q);
        return question.getString(q+"_desc");
        }
        catch(Exception e)
        {
            Log.d(TAG, e.toString());
        }
        return null;
    }

    public static String getQuestionOption(String q, String o)
    {

        try {

        JSONObject question = getQuestionInfo(q);
        return question.getString(o);
        }
        catch(Exception e)
        {
            Log.d(TAG, e.toString());
        }
        return null;
    }

    public static String getQuestionAction(String q, String o)
    {
        try {
            JSONObject question = getQuestionInfo(q);
        return question.getString(o+"_action");
        }
        catch(Exception e)
        {
            Log.d(TAG, e.toString());
        }
        return null;
    }
}

