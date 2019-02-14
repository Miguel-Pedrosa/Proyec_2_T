package com.example.zafiro8.proyec_2_t;

public class ClaseReceta {
    //atributos
    private int ID_Receta;
    private String Nombre_Receta;
    private String Categoria_Receta;
    private String Archivo_Receta;
    private String foto;

    //constuctor
    public ClaseReceta (int ID_Receta, String Nombre_Receta, String Categoria_Receta, String Archivo_Receta, String foto){
        this.ID_Receta = ID_Receta;
        this.Nombre_Receta = Nombre_Receta;
        this.Categoria_Receta = Categoria_Receta;
        this.Archivo_Receta = Archivo_Receta;
        this.foto = foto;
    }

    //public ClaseReceta(){}

    public ClaseReceta(int ID_Receta){
        this.ID_Receta = ID_Receta;
    }

    //metodos get and set
    public int getID_Receta() {
        return ID_Receta;
    }

    public void setID_Receta(int ID_Receta) {
        this.ID_Receta = ID_Receta;
    }

    public String getNombre_Receta() {
        return Nombre_Receta;
    }

    public void setNombre_Receta(String nombre_Receta) {
        Nombre_Receta = nombre_Receta;
    }

    public String getCategoria_Receta() {
        return Categoria_Receta;
    }

    public void setCategoria_Receta(String categoria_Receta) {
        Categoria_Receta = categoria_Receta;
    }

    public String getArchivo_Receta() {
        return Archivo_Receta;
    }

    public void setArchivo_Receta(String archivo_Receta) {
        Archivo_Receta = archivo_Receta;
    }

    public String getFoto() {return foto;}

    public void setFoto(String foto) {this.foto = foto;}
}
