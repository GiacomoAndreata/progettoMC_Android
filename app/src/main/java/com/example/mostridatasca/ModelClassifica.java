package com.example.mostridatasca;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ModelClassifica {

    public static final ModelClassifica instance = new ModelClassifica();
    private JSONArray datiGiocatori;

    private ModelClassifica(){
        datiGiocatori = new JSONArray();
    }

    public static ModelClassifica getInstance(){
        return instance;
    };

    JSONObject get(int index) throws JSONException {
        return datiGiocatori.getJSONObject(index);
    }

    int getSize(){
        return datiGiocatori.length();
    }

    void add(Object datiGiocatoriObject){
        Log.d("ModelADD", "Add: " + datiGiocatoriObject.toString());
        datiGiocatori.put(datiGiocatoriObject);
    }

    void clear(){
        datiGiocatori = new JSONArray();
    }
}