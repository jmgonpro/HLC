package com.example.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumarOMultiplicar extends AppCompatActivity {
    private Button sumar, multiplicar;
    private EditText numero1, numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar_o_multiplicar);
        sumar = findViewById(R.id.bt_Sumar);
        multiplicar = findViewById(R.id.bt_Multiplicar);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();
                int contenido = Integer.parseInt(n1) + Integer.parseInt(n2);
                resultado.setText("" + contenido + "");
                Toast.makeText(SumarOMultiplicar.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numero1.getText().toString();
                String n2 = numero2.getText().toString();
                int contenido = Integer.parseInt(n1) * Integer.parseInt(n2);
                resultado.setText("" + contenido + "");
                Toast.makeText(SumarOMultiplicar.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });
    }
}