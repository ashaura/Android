package net.smallacademy.authenticatorapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class DashboardActivity extends AppCompatActivity {

    private AppCompatButton buttonProfile,button3,button4,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        buttonProfile = findViewById(R.id.buttonProfile);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button4 = findViewById(R.id.button4);
        buttonProfile.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        });
        button3.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), GoogleActivity.class));
        });
        button2.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), AmazonActivity.class));
        });
        button4.setOnClickListener(v -> {

            startActivity(new Intent(getApplicationContext(), MicrosoftActivity.class));
        });
    }
}