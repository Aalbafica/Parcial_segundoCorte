package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity2 extends AppCompatActivity {

    TextView txt_nombre_usuario2, estado_usuario2, tipo_usuario2;
    ImageView img_usuario2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nombre = getIntent().getStringExtra("nombre_usuario");
        String estado = getIntent().getStringExtra("estado_usuario");
        String tipo = getIntent().getStringExtra("tipo_usuario");
        String imagen = getIntent().getStringExtra("imagen_usuario");

        txt_nombre_usuario2 = findViewById(R.id.txt_nombre_usuario2);
        estado_usuario2 = findViewById(R.id.estado_usuario2);
        tipo_usuario2 = findViewById(R.id.tipo_usuario2);
        img_usuario2 = findViewById(R.id.img_usuario2);

        txt_nombre_usuario2.setText(nombre);
        estado_usuario2.setText(estado);
        tipo_usuario2.setText(tipo);
        Picasso.get().load(imagen).into(img_usuario2);


    }
}