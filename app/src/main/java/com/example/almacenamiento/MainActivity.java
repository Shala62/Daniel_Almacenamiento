package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Shared(View view) {
        Intent shared = new Intent(MainActivity.this, MainSharedPreference.class);
        startActivity(shared);
    }


    public void Agenda(View view) {
        Intent agenda = new Intent(MainActivity.this, MainAgenda.class);
        startActivity(agenda);
    }

    public void Block(View view) {
        Intent block = new Intent(MainActivity.this, MainBlock.class);
        startActivity(block);
    }

    /*
    public void Nombres(View view) {
        Intent nombres = new Intent(MainActivity.this, MainNombres.class);
        startActivity(nombres);
    } */
}