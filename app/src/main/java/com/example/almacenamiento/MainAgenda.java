package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainAgenda extends AppCompatActivity {

    private EditText nombre, apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_agenda);

        nombre = findViewById(R.id.etNombre);
        apellido = findViewById(R.id.eTApellido);

    }

    public void GuardarAgenda(View view) {
        String nombre2 = nombre.getText().toString();
        String apellido2 = apellido.getText().toString();
        SharedPreferences preferences = getSharedPreferences("Agenda", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferences.edit();
        Obj_editor.putString(nombre2, apellido2);
        Obj_editor.commit();
        Toast.makeText(this, "Se han Guardado los Datos", Toast.LENGTH_LONG).show();
    }

    public void Buscar(View view) {
        String nombre2 = nombre.getText().toString();
        SharedPreferences preferences = getSharedPreferences("Agenda", Context.MODE_PRIVATE);
        String apellido2 = preferences.getString(nombre2,"");
        if (apellido2.length() == 0) {
            Toast.makeText(this, "No se ha encontrado ningún registro", Toast.LENGTH_LONG).show();
        }else {
            apellido.setText(apellido2);
        }
    }
}