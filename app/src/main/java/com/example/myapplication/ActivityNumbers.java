package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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
