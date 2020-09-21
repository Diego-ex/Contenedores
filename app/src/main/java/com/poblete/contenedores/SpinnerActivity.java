package com.poblete.contenedores;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner_xml, spinner_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        // enlace
        spinner_xml = findViewById(R.id.spinner_xml);
        spinner_java = findViewById(R.id.spinner_java);

        ArrayAdapter<CharSequence> adaptador =
                ArrayAdapter.createFromResource
                        (SpinnerActivity.this,R.array.planets_array,android.R.layout.simple_spinner_item);
        spinner_xml.setAdapter(adaptador);

        //integrar backArrow para volver al main y destruir esta pantalla
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}