package com.example.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SobreMi extends AppCompatActivity {
    private EditText txtGithub, txtMezquita;
    private Button btAbrirGithub, btAbrirLocalizacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_mi);

        txtGithub = findViewById(R.id.github);
        txtMezquita = findViewById(R.id.mezquita);
        btAbrirGithub = findViewById(R.id.abrir_github);
        btAbrirLocalizacion = findViewById(R.id.bt_localizacion);

        btAbrirGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = txtGithub.getText().toString();
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                if (intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);

                Toast.makeText(SobreMi.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });

        btAbrirLocalizacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri addressUri = Uri.parse("google.streetview:cbll=37.878865,-4.779342");
                Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
                Toast.makeText(SobreMi.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });
    }
}