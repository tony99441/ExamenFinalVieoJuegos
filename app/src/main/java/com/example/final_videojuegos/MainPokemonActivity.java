package com.example.final_videojuegos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPokemonActivity extends AppCompatActivity {

    Button btnListarPokemons = findViewById(R.id.ButtonListar);
    Button btnPokemonCapturado = findViewById(R.id.buttonCapturados);
    Button btnCrearPokemon = findViewById(R.id.buttonCrear);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pokemon);



        btnListarPokemons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPokemonActivity.this, PokemonListActivity.class);
                startActivity(intent);
            }
        });

        btnPokemonCapturado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPokemonActivity.this, PokemonCapturadoListActivity.class);
                startActivity(intent);
            }
        });

        btnCrearPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPokemonActivity.this, FormPokemonActivity.class);
                startActivity(intent);
            }
        });




    }


}