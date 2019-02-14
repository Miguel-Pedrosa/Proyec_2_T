package com.example.zafiro8.proyec_2_t;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edt_Usuario;
    private EditText edt_Pass;
    private Button btn_Entrar;
    int chivato = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_Usuario = (EditText)findViewById(R.id.edt_Usuario);
        edt_Pass = (EditText) findViewById(R.id.edt_Pass);

        btn_Entrar = (Button) findViewById(R.id.btn_Entrar);
        btn_Entrar.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    //metodo de pulsado del boton entrar para acceder a la siguiente actividad
    public void onClick(View v) {

        Intent RecetasView = new Intent(this, Recetas.class);
        //RecetasView.putExtra("chivat",chivato);
        startActivity(RecetasView);

    }
}
