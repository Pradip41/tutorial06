package com.example.tutorial06;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash_screen extends AppCompatActivity {

    @SuppressLint("CommitPrefEdits")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("MyPreferences", 0);
        SharedPreferences.Editor editor = preferences.edit();

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent a1 = new Intent(splash_screen.this, MainActivity.class);
                startActivity(a1);
                finish();
            }
        },2000);
    }
}