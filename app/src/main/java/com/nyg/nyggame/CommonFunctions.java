package com.nyg.nyggame;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class CommonFunctions {
    public boolean[] finales = {false, false, false, false};

    public static void setImage(ImageView image, int src) {
        image.setImageResource(src);
    }

    public static void setText(TextView text, int txt) {
        text.setText(txt);
    }

    public static void setButton(Button button, int btn) {
        button.setText(btn);
    }
}
