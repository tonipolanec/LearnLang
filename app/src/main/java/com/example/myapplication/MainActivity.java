package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gumbMain = (Button) findViewById(R.id.gumbMain);
        gumbMain.setShadowLayer(12,8,7, Color.parseColor("#222831"));



        Spinner spinLangFrom = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.languageTo, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinLangFrom.setAdapter(adapter);


       /*ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.languageTo, R.layout.custom_spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinLangFrom.setAdapter(adapter);
        */

        spinLangFrom.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext(); // Postavljanje languagea u globalnu varijablu.
        if(pos == 0)
            globalVariable.setLanguage("slo");
        else if(pos == 1)
            globalVariable.setLanguage("eng");
    }

    public void onNothingSelected(AdapterView<?> parent) {
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext(); // Postavljanje languagea u globalnu varijablu.
        globalVariable.setLanguage("eng");
    }



    //https://colorhunt.co/palette/2763 bojiceee

    public void onClickMain(View view){
        Intent i = new Intent(this,Activity1.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}


