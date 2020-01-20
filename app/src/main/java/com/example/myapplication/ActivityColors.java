package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ActivityColors extends AppCompatActivity {

    public boolean transp[] = new boolean[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_colors);

        Button b0 = (Button) findViewById(R.id.gumbC0);
        Button b1 = (Button) findViewById(R.id.gumbC1);
        Button b2 = (Button) findViewById(R.id.gumbC2);
        Button b3 = (Button) findViewById(R.id.gumbC3);
        Button b4 = (Button) findViewById(R.id.gumbC4);
        Button b5 = (Button) findViewById(R.id.gumbC5);
        Button b6 = (Button) findViewById(R.id.gumbC6);
        Button b7 = (Button) findViewById(R.id.gumbC7);
        Button b8 = (Button) findViewById(R.id.gumbC8);
        Button b9 = (Button) findViewById(R.id.gumbC9);

        final GlobalClass globalVariable = (GlobalClass) getApplicationContext(); // Uzimanje languagea iz globalne varijable.
        final String lang  = globalVariable.getLanguage();

        Resources res = getResources();
        String[] colors = null;
        if(lang == "eng")
            colors = res.getStringArray(R.array.eng_colors);
        else if(lang == "slo")
            colors = res.getStringArray(R.array.slo_colors);

        b0.setText(colors[0]);
        b1.setText(colors[1]);
        b2.setText(colors[2]);
        b3.setText(colors[3]);
        b4.setText(colors[4]);
        b5.setText(colors[5]);
        b6.setText(colors[6]);
        b7.setText(colors[7]);
        b8.setText(colors[8]);
        b9.setText(colors[9]);

        for(boolean b : transp){
            b = true;
        }

    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void onClickC0(View v){
        Button b = (Button) findViewById(R.id.gumbC0);

        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#FF0000"));
        }
        
    }
    public void onClickC1(View v){
        Button b = (Button) findViewById(R.id.gumbC1);

        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#FF5722"));
        }

    }
    public void onClickC2(View v){
        Button b = (Button) findViewById(R.id.gumbC2);
        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#FFEB3B"));
        }
    }
    public void onClickC3(View v){
        Button b = (Button) findViewById(R.id.gumbC3);
        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#4CAF50"));
        }
    }
    public void onClickC4(View v){
        Button b = (Button) findViewById(R.id.gumbC4);
        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#0620C4"));
        }
    }
    public void onClickC5(View v){
        Button b = (Button) findViewById(R.id.gumbC5);
        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#673AB7"));
        }
    }
    public void onClickC6(View v){
        Button b = (Button) findViewById(R.id.gumbC6);
        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#8B4513"));
        }
    }
    public void onClickC7(View v){
        Button b = (Button) findViewById(R.id.gumbC7);
        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#FF03E6"));
        }
    }
    public void onClickC8(View v){
        Button b = (Button) findViewById(R.id.gumbC8);
        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#000000"));
        }
    }
    public void onClickC9(View v){
        Button b = (Button) findViewById(R.id.gumbC9);
        if(b.getCurrentHintTextColor() == Color.parseColor("#000000")) {
            b.setHintTextColor(Color.parseColor(("#ffffff")));
            b.setBackgroundColor(Color.parseColor("#30343b"));
        }else{
            b.setHintTextColor(Color.parseColor(("#000000")));
            b.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
    }


}
