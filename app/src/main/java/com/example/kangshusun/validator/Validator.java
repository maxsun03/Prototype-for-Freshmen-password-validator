package com.example.kangshusun.validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

public class Validator extends AppCompatActivity {

    public static int Validator(String p){
        char sc[]=new char[12];
        for(int i=0; i<p.length(); i++)
            sc[i]=p.charAt(i);
            int success=0;
        if(p.length()>=8)
            success++;
        if(p.equalsIgnoreCase("password"))
            success++;
        if(p.length()<13)
            success++;
        for(int i=0; i<13; i++) {
            if (Character.isDigit(sc[i])) {
                success++;
                break;
            }
        }
        for(int j=0; j<13; j++) {
            if (Character.isUpperCase(sc[j])) {
                success++;
                break;
            }
        }
        return success;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
    }
}
