package com.example.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bienvenida = findViewById(R.id.bt_bienvenida);
        final Intent intent = new Intent(MainActivity.this, OpcionesActivity.class);
        Toast.makeText(MainActivity.this, "centerCrop", Toast.LENGTH_LONG).show();

        bienvenida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
                Toast.makeText(MainActivity.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });
    }
}