package com.example.kasir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Timer().schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                        finish();
                    }
                }
                , 2000);
        }
    }
