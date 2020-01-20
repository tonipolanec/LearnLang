package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ActivityFamMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_fam_members);

        Button gumbFam = (Button) findViewById(R.id.gumbFam);
        gumbFam.setShadowLayer(12,8,7, Color.parseColor("#222831"));

        Button b0 = (Button) findViewById(R.id.gumbFM0);
        Button b1 = (Button) findViewById(R.id.gumbFM1);
        Button b2 = (Button) findViewById(R.id.gumbFM2);
        Button b3 = (Button) findViewById(R.id.gumbFM3);
        Button b4 = (Button) findViewById(R.id.gumbFM4);
        Button b5 = (Button) findViewById(R.id.gumbFM5);

        final GlobalClass globalVariable = (GlobalClass) getApplicationContext(); // Uzimanje languagea iz globalne varijable.
        final String lang  = globalVariable.getLanguage();

        Resources res = getResources();
        String[] fMembers = null;
        if(lang == "eng")
            fMembers = res.getStringArray(R.array.eng_members);
        else if(lang == "slo")
            fMembers = res.getStringArray(R.array.slo_members);

        b0.setText(fMembers[0]);
        b1.setText(fMembers[1]);
        b2.setText(fMembers[2]);
        b3.setText(fMembers[3]);
        b4.setText(fMembers[4]);
        b5.setText(fMembers[5]);


    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void onClickFM0(View v){
        Button b = (Button) findViewById(R.id.gumbFM0);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickFM1(View v){
        Button b = (Button) findViewById(R.id.gumbFM1);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickFM2(View v){
        Button b = (Button) findViewById(R.id.gumbFM2);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickFM3(View v){
        Button b = (Button) findViewById(R.id.gumbFM3);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickFM4(View v){
        Button b = (Button) findViewById(R.id.gumbFM4);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }
    public void onClickFM5(View v){
        Button b = (Button) findViewById(R.id.gumbFM5);
        if(b.getCurrentTextColor() == Color.parseColor("#222831")) {
            b.setTextColor(Color.parseColor("#00adb5"));
            b.setBackgroundColor(Color.parseColor(("#393e46")));
        }else{
            b.setTextColor(Color.parseColor("#222831"));
            b.setBackgroundColor(Color.parseColor("#222831"));
        }
    }


}
