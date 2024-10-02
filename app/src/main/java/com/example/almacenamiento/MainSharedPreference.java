package com.example.almacenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainSharedPreference extends AppCompatActivity {

    private EditText txt1;
    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_shared_preference);

        txt1 = findViewById(R.id.txtCorreo);
        btn1 = findViewById(R.id.btnGuardar);

        SharedPreferences preference = getSharedPreferences("Datos", Context.MODE_PRIVATE);
        txt1.setText(preference.getString("Email", ""));

    }

    public void Guardar(View view){
        SharedPreferences preferences = getSharedPreferences("Datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor Obj_editor = preferences.edit();
        Obj_editor.putString("Email", txt1.getText().toString());
        Obj_editor.commit();
        finish();
    }
}