package com.nyg.nyggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntroUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_uno);
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), IntroDos.class);
        startActivity(intent);
    }
}
