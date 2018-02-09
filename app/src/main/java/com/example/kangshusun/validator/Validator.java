package com.example.kangshusun.validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
        for(int i=0; i<12; i++) {
            if (Character.isDigit(sc[i])) {
                success++;
                break;
            }
        }
        for(int j=0; j<12; j++) {
            if (Character.isUpperCase(sc[j])) {
                success++;
                break;
            }
        }
        return success;
    }

    EditText editText;
    TextView textView;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validator);
        // Get the Intent that started this activity and extract the string

        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);
        sendButton = (Button) findViewById(R.id.button4);
        sendButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String message1="strong";
                String message2="not strong";
                String input = editText.getText().toString();
                int respond=Validator(input);
                if(respond==5)
                    textView.setText(message1);
                else
                    textView.setText(message2);

            }
        });
    }
}
