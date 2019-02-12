package com.example.converter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.option_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id= item.getItemId();
        if (id==R.id.about){

            Intent aboutIntent= new Intent(getApplicationContext(), About.class);
            startActivity(aboutIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

       }

