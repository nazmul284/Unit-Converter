package com.example.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Temperature extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText input_temperatur;
    Spinner select_temp;
    TextView celcius,fahrenheit,kelvin;
    List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        input_temperatur = (EditText) findViewById(R.id.input_temperatur);
        select_temp = (Spinner)findViewById(R.id.select_temp);

        celcius = (TextView)findViewById(R.id.celcius);
        fahrenheit = (TextView)findViewById(R.id.fahrenheit);
        kelvin = (TextView)findViewById(R.id.kelvin);



        select_temp.setOnItemSelectedListener(this);



        items = new ArrayList<String>();
        items.add("Select");
        items.add("C");
        items.add("F");
        items.add("K");


        ArrayAdapter<String> tempAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,items);
        tempAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        select_temp.setAdapter(tempAdapter);





    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = (String) parent.getItemAtPosition(position).toString();

        try {

            /* Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();*/


            if(item.equals("C")){


                Double cel = Double.parseDouble((input_temperatur.getText().toString()));
                input_temperatur.setText("");

                double celc = cel;
                celcius.setText("Celcius: "+ new Double(celc).toString());
                celcius.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double fahren = ((cel * 9)/5)+32;
                fahrenheit.setText("Fahrenheit: "+ new Double(fahren).toString());
                fahrenheit.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double kel =(cel+273.15);
                kelvin.setText("Kelvin: "+ new Double(kel).toString());
                kelvin.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                select_temp.setSelection(0);


            }else if (item.equals("F")){

                Double far = Double.parseDouble((input_temperatur.getText().toString()));
                input_temperatur.setText("");


                double celc = ((far-32)/1.8);
                celcius.setText("Celcius: "+ new Double(celc).toString());
                celcius.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double fahren = far;
                fahrenheit.setText("Fahrenheit: "+ new Double(fahren).toString());

                fahrenheit.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double kel = (celc+273.15);
                kelvin.setText("Kelvin: "+ new Double(kel).toString());
                kelvin.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                select_temp.setSelection(0);


            }else if(item.equals("K")){

                Double kelvi = Double.parseDouble((input_temperatur.getText().toString()));
                input_temperatur.setText("");


                double celc = kelvi - 273.15;
                celcius.setText("Celcius: "+ new Double(celc).toString());
                celcius.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double fahren = ((kelvi)*9/5)-459.67;
                fahrenheit.setText("Fahrenheit: "+ new Double(fahren).toString());
                fahrenheit.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double kel =kelvi;
                kelvin.setText("Kelvin: "+ new Double(kel).toString());

                kelvin.setTextColor(this.getResources().getColor(R.color.temp_bg));

                select_temp.setSelection(0);

            }



        }catch (Exception e){
            e.printStackTrace();

        }
        }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

