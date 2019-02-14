package com.example.zafiro8.proyec_2_t;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorVista extends RecyclerView.Adapter<AdaptadorVista.ViewHolderDatos> {

    ArrayList<ClaseReceta> ListaRecetas;

    public AdaptadorVista(BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener, ArrayList<ClaseReceta> ListaRecetas) {
        this.ListaRecetas = ListaRecetas;
    }


    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.vista, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos viewHolderDatos, int i) {
        viewHolderDatos.asignarDatos(String.valueOf(ListaRecetas.get(i)));
    }

    @Override
    public int getItemCount() {
        return ListaRecetas.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView NombreReceta;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            NombreReceta = (TextView) itemView.findViewById(R.id.Nombre_R);

        }

        public void asignarDatos(String s) {
            NombreReceta.setText(s);
        }
    }
}
