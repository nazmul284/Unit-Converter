package com.example.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button data, length, temperatur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = (Button) findViewById(R.id.data);
        length = (Button) findViewById(R.id.length);
        temperatur = (Button) findViewById(R.id.temperatur);

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dataIntent = new Intent(getApplicationContext(),Data.class);
                startActivity(dataIntent);

            }
        });

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lengthIntent = new Intent(getApplicationContext(),Length.class);
                startActivity(lengthIntent);
            }
        });

        temperatur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tempIntent = new Intent(getApplicationContext(),Temperature.class);
                startActivity(tempIntent);
            }
        });


    }
}
