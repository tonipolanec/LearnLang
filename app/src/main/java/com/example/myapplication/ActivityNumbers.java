package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ActivityNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_numbers);

        Button b0 = (Button) findViewById(R.id.gumbN0);
        Button b1 = (Button) findViewById(R.id.gumbN1);
        Button b2 = (Button) findViewById(R.id.gumbN2);
        Button b3 = (Button) findViewById(R.id.gumbN3);
        Button b4 = (Button) findViewById(R.id.gumbN4);
        Button b5 = (Button) findViewById(R.id.gumbN5);
        Button b6 = (Button) findViewById(R.id.gumbN6);
        Button b7 = (Button) findViewById(R.id.gumbN7);
        Button b8 = (Button) findViewById(R.id.gumbN8);
        Button b9 = (Button) findViewById(R.id.gumbN9);
        Button b10 = (Button) findViewById(R.id.gumbN10);

        final GlobalClass globalVariable = (GlobalClass) getApplicationContext(); // Uzimanje languagea iz globalne varijable.
        final String lang  = globalVariable.getLanguage();

        Resources res = getResources();
        String[] numbers = null;
        if(lang == "eng")
            numbers = res.getStringArray(R.array.eng_numbers);
        else if(lang == "slo")
            numbers = res.getStringArray(R.array.slo_numbers);

        b0.setText(numbers[0]);
        b1.setText(numbers[1]);
        b2.setText(numbers[2]);
        b3.setText(numbers[3]);
        b4.setText(numbers[4]);
        b5.setText(numbers[5]);
        b6.setText(numbers[6]);
        b7.setText(numbers[7]);
        b8.setText(numbers[8]);
        b9.setText(numbers[9]);
        b10.setText(numbers[10]);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void onClickGN0(View v){
        Button b = (Button) findViewById(R.id.gumbN0);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN1(View v){
        Button b = (Button) findViewById(R.id.gumbN1);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN2(View v){
        Button b = (Button) findViewById(R.id.gumbN2);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN3(View v){
        Button b = (Button) findViewById(R.id.gumbN3);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN4(View v){
        Button b = (Button) findViewById(R.id.gumbN4);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN5(View v){
        Button b = (Button) findViewById(R.id.gumbN5);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN6(View v){
        Button b = (Button) findViewById(R.id.gumbN6);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN7(View v){
        Button b = (Button) findViewById(R.id.gumbN7);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN8(View v){
        Button b = (Button) findViewById(R.id.gumbN8);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN9(View v){
        Button b = (Button) findViewById(R.id.gumbN9);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickGN10(View v){
        Button b = (Button) findViewById(R.id.gumbN10);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }


}
