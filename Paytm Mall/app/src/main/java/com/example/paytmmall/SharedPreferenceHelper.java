package com.example.paytmmall;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceHelper {

    public static final String KEY = "orderDB";

    public static SharedPreferences getSharedPreference(Context context) {
        return context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
    }

    public static void writeStringPreference(Context context, String key, String value) {
    SharedPreferences.Editor editor = getSharedPreference(context).edit();
    editor.putString(key, value);
    editor.apply();
    }
    public static String getStringPreference(Context context , String key){
        return getSharedPreference(context).getString(key,null);
    }
}
