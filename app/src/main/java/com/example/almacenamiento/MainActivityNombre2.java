package com.example.almacenamiento;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityNombre2 extends AppCompatActivity {

    RatingBar ratingBar;
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_nombre2);

        ratingBar = findViewById(R.id.ratingBar);
        String dato = getIntent().getStringExtra("dato");

        txt1 = findViewById(R.id.txtBienvenido);

        txt1.setText("Bienvenido " + dato);

    }
    public void Calificar (View view){
        float rating = ratingBar.getRating();
        Toast.makeText(MainActivityNombre2.this, "Calificación: " + rating, Toast.LENGTH_SHORT).show();
    }

}