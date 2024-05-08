package com.example.ofwjobagency;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Countries extends AppCompatActivity {

    Button btnJapan, btnUSA, btnSaudiArabia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_countries);

        btnJapan = findViewById(R.id.btnJapan);
        btnUSA = findViewById(R.id.btnUSA);
        btnSaudiArabia = findViewById(R.id.btnSaudiArabia);

        btnJapan.setOnClickListener(v -> {
            Intent intent = new Intent(Countries.this, JobOffers.class);
            startActivity(intent);
        });

        btnUSA.setOnClickListener(v -> {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        });

        btnSaudiArabia.setOnClickListener(v -> {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.countries), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}