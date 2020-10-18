package com.mobile.praktekmp2;

import android.content.Context;
import android.content.SharedPreferences;

public class sharedprefmanager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public sharedprefmanager(Context context){
        sharedPreferences = context.getSharedPreferences("latihan shredpref",context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }
    public void saveString(String value){
        editor.putString("ini string",value);
        editor.commit();
    }
    public String getString(){return sharedPreferences.getString("ini string","");}
}
