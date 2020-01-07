package com.example.ordinancetweetmining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class AppBio extends AppCompatActivity {

    Button btn_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bio);

        btn_select = (Button) findViewById(R.id.buttonsearchsession);
        btn_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in=new Intent(AppBio.this,selection.class);
                startActivity(in);
            }
        });

    }
}
