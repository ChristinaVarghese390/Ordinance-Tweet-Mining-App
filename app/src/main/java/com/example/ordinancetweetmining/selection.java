package com.example.ordinancetweetmining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import android.os.Bundle;

public class selection extends AppCompatActivity {

    Button btn_general;
    Button  btn_sessionone;
    Button  btn_sessiontwo;
    Button  btn_bothsessions;
    Spinner citynamesspinner;
    String [] city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectsession);

        btn_general =(Button) findViewById(R.id.buttongeneralquestions);
        btn_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(selection.this,generalquestions.class);
                startActivity(in);
            }
        });

        btn_sessionone = (Button) findViewById(R.id.session1);
        btn_sessionone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(selection.this,sessionone.class);
                startActivity(in);

            }
        });

        btn_sessiontwo = (Button) findViewById(R.id.session2);
        btn_sessiontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(selection.this,sessiontwo.class);
                startActivity(in);
            }
        });

        btn_bothsessions = (Button) findViewById(R.id.bothsessions);
        btn_bothsessions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(selection.this,bothsessions.class);
                startActivity(in);

            }
        });

citynamesspinner = (Spinner) findViewById(R.id.selectcityspinner);
city = getResources().getStringArray(R.array.citynames);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,city);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        citynamesspinner.setAdapter(adapter);

    }
}
