package com.nyg.nyggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InsultosIni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_choose);

        CommonFunctions.setImage((ImageView)findViewById(R.id.image), R.drawable.img_insultos_uno);
        CommonFunctions.setText((TextView)findViewById(R.id.text), R.string.txt_insultos_uno);
        CommonFunctions.setButton((Button)findViewById(R.id.button), R.string.btn_insultos_uno);
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), Insultos.class);
        startActivity(intent);
    }
}
