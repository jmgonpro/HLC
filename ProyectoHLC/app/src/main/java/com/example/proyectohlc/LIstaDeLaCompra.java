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

import java.util.ArrayList;
import java.util.List;

public class LIstaDeLaCompra extends AppCompatActivity {
    private Button buscar, agregar, lista;
    private EditText producto, tienda;
    public static List<String> lista_productos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_la_compra);
        buscar = findViewById(R.id.bt_buscar_tienda);
        agregar = findViewById(R.id.bt_agregar);
        lista = findViewById(R.id.bt_lista);
        producto = findViewById(R.id.producto);
        tienda = findViewById(R.id.nombre_tienda);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LIstaDeLaCompra.this, "OnClickListener", Toast.LENGTH_LONG).show();
                if (lista_productos.size() == 10)
                    Toast.makeText(LIstaDeLaCompra.this, "Se han añadido 10 productos", Toast.LENGTH_SHORT).show();

                else {
                    lista_productos.add(producto.getText().toString());
                    Toast.makeText(LIstaDeLaCompra.this, "Añadido el producto: " + producto.getText().toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });

        lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LIstaDeLaCompra.this, MostrarLista.class);
                if (lista_productos.size() > 0)
                    startActivity(intent);

                else
                    Toast.makeText(LIstaDeLaCompra.this, "No se han añadido ningún producto", Toast.LENGTH_SHORT).show();
            }
        });

        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loc = tienda.getText().toString();

                Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
                Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

                if (intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);

                Toast.makeText(LIstaDeLaCompra.this, "OnClickListener", Toast.LENGTH_LONG).show();
            }
        });

    }
}