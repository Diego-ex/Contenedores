package com.poblete.contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btn_Spinner, btn_RecylerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Spinner = findViewById(R.id.btn_Spinner);
        btn_RecylerView = findViewById(R.id.btn_RecyclerView);

        // Para cambiar de pantalla se debe crear un objeto de la clase Intent

        btn_Spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // se deben ingresar dos parametros, el activity actual y el activity que quiero mostrar
                Intent intento = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intento);
                // toast de prueba Toast.makeText(MainActivity.this, "Spinner", Toast.LENGTH_LONG).show();
            }
        });
        btn_RecylerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // se deben ingresar dos parametros, el activity actual y el activity que quiero mostrar
                //Intent intento2 = new Intent(MainActivity.this, RecyclerActivity.class);
                //startActivity(intento2);

                //Otra manera para cambiar de actividad (Pantallas, Screen)
                startActivity(new Intent(MainActivity.this,RecyclerActivity.class));

                // toast de prueba Toast.makeText(MainActivity.this, "Recyler View", Toast.LENGTH_LONG).show();
            }
        });

    }
}