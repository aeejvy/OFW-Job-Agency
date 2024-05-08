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

public class JobOffers extends AppCompatActivity {

    Button btnApply, btnApplyChef, btnApplyMidWife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_job_offers);

        btnApply = findViewById(R.id.btnApply);
        btnApplyChef = findViewById(R.id.btnApplyChef);
        btnApplyMidWife = findViewById(R.id.btnApplyMidWife);

        btnApply.setOnClickListener(v -> {
            Intent intent = new Intent(this, HouseMaid.class);
            startActivity(intent);
        });

        btnApplyChef.setOnClickListener(v -> {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        });

        btnApplyMidWife.setOnClickListener(v -> {
            Toast.makeText(this, "Coming Soon", Toast.LENGTH_SHORT).show();
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.jobOffers), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}