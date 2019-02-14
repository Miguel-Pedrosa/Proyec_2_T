package com.example.zafiro8.proyec_2_t;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabaseOpenHelper extends SQLiteAssetHelper {

    //Base de datos con la que vamos a trabajar
    private static final String DATABASE_NAME = "Recetas";

    //version
    private static final int DATABASE_VERSION = 1;

    //constructor
    public DatabaseOpenHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

}
