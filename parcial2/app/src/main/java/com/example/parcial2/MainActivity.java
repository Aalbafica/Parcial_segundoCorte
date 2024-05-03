package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_ingresar;
    EditText usuario,contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = findViewById(R.id.User);
        contra = findViewById(R.id.password);
        btn_ingresar = findViewById(R.id.Ingresar);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto1 = usuario.getText().toString();
                String texto2 = contra.getText().toString();

                    if (!texto1.isEmpty() && !texto2.isEmpty()){
                        Intent entrar = new Intent(MainActivity.this, Adaptador.class);
                        startActivity(entrar);
                    }else{
                        Toast.makeText(MainActivity.this,"Por favor llenar los campos", Toast.LENGTH_LONG).show();
                    }



            }
        });

    }
}