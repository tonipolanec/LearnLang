package com.example.myapplication;


import android.app.Application;

public class GlobalClass extends Application {

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String _language) {
        language = _language;
    }

}