package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gumbMain = (Button) findViewById(R.id.gumbMain);
        gumbMain.setShadowLayer(12,8,7, Color.parseColor("#222831"));

    }
    //https://colorhunt.co/palette/2763 bojiceee

    public void onClickMain(View view){
        Intent i = new Intent(this,Activity1.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}
