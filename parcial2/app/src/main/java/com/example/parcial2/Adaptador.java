package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.parcial2.UsuarioAdapt.UserAdapt;
import com.example.parcial2.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Adaptador extends AppCompatActivity implements RecyclerViewInterface{

    RecyclerView rcv_usuarios;

    List<Usuario> listaUsuarios = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptador);

        rcv_usuarios = findViewById(R.id.rcv_usuarios);


        Usuario usu = new Usuario("https://rickandmortyapi.com/api/character/avatar/72.jpeg","Rick sanchez","Alive","Human"); // rick
        Usuario usu2 = new Usuario("https://rickandmortyapi.com/api/character/avatar/2.jpeg","Morty Smith","Alive","Human"); // morty
        Usuario usu3 = new Usuario("https://rickandmortyapi.com/api/character/avatar/120.jpeg","Summer Smith","Alive","Human"); // summer
        Usuario usu4 = new Usuario("https://rickandmortyapi.com/api/character/avatar/4.jpeg","Beth Smith","Alive","Human"); // beth
        Usuario usu5 = new Usuario("https://rickandmortyapi.com/api/character/avatar/5.jpeg","Jerry Smith","Alive","Human"); // jerry


        listaUsuarios.add(usu);
        listaUsuarios.add(usu2);
        listaUsuarios.add(usu3);
        listaUsuarios.add(usu4);
        listaUsuarios.add(usu5);


        rcv_usuarios.setLayoutManager(new LinearLayoutManager(this));
        rcv_usuarios.setAdapter(new UserAdapt(listaUsuarios, this));


    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(Adaptador.this, MainActivity2.class);
        intent.putExtra("nombre_uuario", listaUsuarios.get(position).getNombre());
        intent.putExtra("estado_usuario", listaUsuarios.get(position).getEstado());
        intent.putExtra("tipo_usuario", listaUsuarios.get(position).getTipo());
        intent.putExtra("image_usuario", listaUsuarios.get(position).getImagen());
        startActivity(intent);
    }
}