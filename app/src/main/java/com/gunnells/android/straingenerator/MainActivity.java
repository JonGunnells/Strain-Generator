package com.gunnells.android.straingenerator;

import java.math.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static String strain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void displayStrain(View view) {
        String priceMessage = strain;
        displayMessage(priceMessage);
    }


    private void displayMessage(String message) {
        TextView strainTextView = (TextView) findViewById(R.id.strain_text_view);
        strainTextView.setText(message);
        Strain.strainMaker();

    }


}