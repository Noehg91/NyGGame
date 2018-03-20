package com.nyg.nyggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LlamaTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);

        CommonFunctions.setImage((ImageView)findViewById(R.id.image), R.drawable.img_llama_tres);
        CommonFunctions.setText((TextView)findViewById(R.id.text), R.string.txt_llama_tres);
        CommonFunctions.setButton((Button)findViewById(R.id.button1), R.string.btn_llama_tres_op1);
        CommonFunctions.setButton((Button)findViewById(R.id.button2), R.string.btn_llama_tres_op2);
    }

    public void nextActivityOp1(View view) {
        Intent intent = new Intent(getApplicationContext(), CuevaUno.class);
        startActivity(intent);
    }

    public void nextActivityOp2(View view) {
        Intent intent = new Intent(getApplicationContext(), BosqueUno.class);
        startActivity(intent);
    }
}
