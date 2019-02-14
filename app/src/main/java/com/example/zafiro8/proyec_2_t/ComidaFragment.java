package com.example.zafiro8.proyec_2_t;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class ComidaFragment extends Fragment {


    private Toolbar toolbar;
    private RecyclerView rcv_Lista;
    private View Inflar_Vista;

    private ArrayList<ClaseReceta> ListaRecetas = new ArrayList<>();

    private AdaptadorVista adaptador;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Inflar_Vista = inflater.inflate(R.layout.fragment_comida, container,false);

        toolbar = (Toolbar) Inflar_Vista.findViewById(R.id.toolbar);







        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comida, container, false);
    }
    //TODO SEGUIR CON EL MENU DEL TOOLBAR
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = get;
        menuInflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);


        switch (id) {
            case R.id.menuItem_principal://Vista coches nuevos
                databaseAccess.open();
                //listaCochesNuevos = databaseAccess.obtenerCochesNuevos();
                //adaptador = new Adaptador(this, listaCochesNuevos);
                //lsvCoches.setAdapter(adaptador);
                //chivato = 1;
                break;
            case R.id.menuItem_entrante://Vista coches usados
                databaseAccess.open();
                //listaCochesUsados = databaseAccess.obtenerCochesUsados();
                //adaptadorUsados = new AdaptadorUsados(this, listaCochesUsados);
                //lsvCoches.setAdapter(adaptadorUsados);
                //chivato = 2;
                break;
            case R.id.menuItem_postre://Vista extras
                databaseAccess.open();
                //listaExtras = databaseAccess.obtenerExtras();
                //adaptadorExtras = new AdaptadorExtras(this, listaExtras);
                //lsvCoches.setAdapter(adaptadorExtras);
                //chivato = 3;
                break;

        }
        databaseAccess.close();

        return super.onOptionsItemSelected(item);
    }*/

}
