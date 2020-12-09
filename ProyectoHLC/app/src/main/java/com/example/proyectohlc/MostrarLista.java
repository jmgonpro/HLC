package com.example.proyectohlc;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.proyectohlc.LIstaDeLaCompra.lista_productos;

public class MostrarLista extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lista);

        TextView textView;
        LinearLayout linearLayout = findViewById(R.id.linear_layout);

        for (int i = 0; i < lista_productos.size(); i++) {
            textView = new TextView(this);

            textView.setTextSize(36);
            textView.setTextColor(Color.parseColor("black"));
            textView.setTypeface(null, Typeface.BOLD);
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            textView.setText(lista_productos.get(i));
            linearLayout.addView(textView);

        }
    }
}