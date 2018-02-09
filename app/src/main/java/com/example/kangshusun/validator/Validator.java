package com.example.kangshusun.validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Validator extends AppCompatActivity {

    public static int Validator(String p){
        int success=0;
        if(p.length()>=8) {
            success++;
            if (p.equalsIgnoreCase("password")) {
                success++;
            }
            return success;
        }
        return success;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }
}
