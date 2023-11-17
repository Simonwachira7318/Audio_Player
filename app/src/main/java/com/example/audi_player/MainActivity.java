package com.example.audi_player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Handler to delay the page switch
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent to switch to the next activity or page
                Intent intent = new Intent(MainActivity.this, MainHome.class);
                startActivity(intent);
                finish();
            }
        }, 4000); // 4 seconds

        Button getStartedButton = findViewById(R.id.button);
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event for the "GET STARTED" button
                Intent intent = new Intent(MainActivity.this, MainHome.class);
                startActivity(intent);
            }
        });
    }
}

