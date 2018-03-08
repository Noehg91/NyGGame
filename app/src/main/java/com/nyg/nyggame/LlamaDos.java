package com.nyg.nyggame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LlamaDos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_choose);

        //CommonFunctions.setImage((ImageView)findViewById(R.id.image), R.drawable.img_llama_dos);
        CommonFunctions.setText((TextView)findViewById(R.id.text), R.string.txt_llama_dos);
        CommonFunctions.setButton((Button)findViewById(R.id.button), R.string.btn_llama_dos);
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), LlamaTres.class);
        startActivity(intent);
    }
}
