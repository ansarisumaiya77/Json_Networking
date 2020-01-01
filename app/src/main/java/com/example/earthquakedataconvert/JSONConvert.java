package com.example.earthquakedataconvert;

import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class JSONConvert {
    public ArrayList<Earthquake> ConvertJson(String json)
    {
        ArrayList<Earthquake> list = new ArrayList<>();
        try
        {
            JSONObject obj = new JSONObject(json);
            JSONArray array = obj.getJSONArray("features");
            for (int i=0; i<array.length();i++)
            {
                JSONObject secondObject = array.getJSONObject(i);
                JSONObject property = secondObject.getJSONObject("properties");
                Earthquake earth = new Earthquake();
                earth.setAlert(property.getString("alert"));
                earth.setMagnitude(property.getDouble("mag"));
                earth.setPlace(property.getString("place"));
                earth.setStatus(property.getString("status"));
                earth.setTitle(property.getString("title"));
//                earth.setTsunami(property.getString("alert"));
                list.add(earth);
            }
        }
        catch (JSONException ex)
        {
//            Toast.makeText(this,ex.getMessage(), Toast.LENGTH_LONG).show();
        }
        return list;
    }
}
