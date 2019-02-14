package com.example.zafiro8.proyec_2_t;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.BottomNavigationView;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

public class DatabaseAccess {

    private SQLiteAssetHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    //Método para obtener la estancia
    public static DatabaseAccess getInstance(Context context) {
        if(instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public static DatabaseAccess getInstance(BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        if(instance == null) {
            instance = new DatabaseAccess((Context) onNavigationItemSelectedListener);
        }
        return instance;
    }

    //Método para abrir la conexión con la Base de Datos
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    //Método para cerrar la conexión con la Base de Datos
    public void close() {
        if(database != null) {
            this.database.close();
        }
    }

    //metodo para obtener todos los extras
    public ArrayList<ClaseReceta> obtenerRecetas(){
        Cursor c;

        ArrayList<ClaseReceta> ListaReceta = new ArrayList<>();

        c = database.rawQuery("SELECT * FROM Recetas", null);

        if(c.moveToFirst()){

            do {
                ListaReceta.add(new ClaseReceta(c.getInt(0),
                                          c.getString(1),
                                          c.getString(2),
                                          c.getString(3),
                                          c.getString(4)));
            }while(c.moveToNext());
        }
        c.close();

        return ListaReceta;
    }

    public ArrayList<ClaseReceta> obtenerReceta_ID(int IdExtra){
        Cursor c;
        ArrayList<ClaseReceta> receta = new ArrayList<>();

        c = database.rawQuery("SELECT * FROM Extras WHERE ID = " + IdExtra, null);

        if(c.moveToFirst()){

            do {
                receta.add(new ClaseReceta(c.getInt(0),
                        c.getString(1),
                        c.getString(2),
                        c.getString(3),
                        c.getString(4)));
            }while(c.moveToNext());
        }
        c.close();

        return receta;
    }

    public ArrayList<ClaseReceta> obtenerReceta_Categoria_Receta(String Categoria_Receta){
        Cursor c;
        ArrayList<ClaseReceta> receta = new ArrayList<>();

        c = database.rawQuery("SELECT * FROM Extras WHERE ID = " + Categoria_Receta, null);

        if(c.moveToFirst()){

            do {
                receta.add(new ClaseReceta(c.getInt(0),
                        c.getString(1),
                        c.getString(2),
                        c.getString(3),
                        c.getString(4)));
            }while(c.moveToNext());
        }
        c.close();

        return receta;
    }


}
