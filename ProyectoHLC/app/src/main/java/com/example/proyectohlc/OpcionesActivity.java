package com.example.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OpcionesActivity extends AppCompatActivity {
    private Button sumarOMultiplicar, listaCompra, sobreMi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        sumarOMultiplicar = findViewById(R.id.bt_sumarOMultiplicar);
        listaCompra = findViewById(R.id.bt_lista_compra);
        sobreMi = findViewById(R.id.bt_sobre_mi);

        sumarOMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcionesActivity.this, SumarOMultiplicar.class);
                startActivity(intent);
                Toast.makeText(OpcionesActivity.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });

        listaCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcionesActivity.this, LIstaDeLaCompra.class);
                startActivity(intent);
                Toast.makeText(OpcionesActivity.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });

        sobreMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcionesActivity.this, SobreMi.class);
                startActivity(intent);
                Toast.makeText(OpcionesActivity.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });


    }
}