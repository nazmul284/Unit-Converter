package com.example.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Power extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText input_power;
    Spinner select_power;
    TextView _kilowatt,_watt,_hp;
    List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);

        input_power = (EditText) findViewById(R.id.input_power);
        select_power = (Spinner)findViewById(R.id.select_power);

        _kilowatt = (TextView)findViewById(R.id.kilowatt);
        _watt = (TextView)findViewById(R.id.watt);
        _hp = (TextView)findViewById(R.id.hp);



        select_power.setOnItemSelectedListener(this);



        items = new ArrayList<String>();
        items.add("Select");
        items.add("Kilowatt");
        items.add("Watt");
        items.add("HP");


        ArrayAdapter<String> tempAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,items);
        tempAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        select_power.setAdapter(tempAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



        String item = (String) parent.getItemAtPosition(position).toString();

        try {

            /* Toast.makeText(parent.getContext(),"Selected"+item,Toast.LENGTH_LONG).show();*/


            if(item.equals("Kilowatt")){


                Double value = Double.parseDouble((input_power.getText().toString()));
                input_power.setText("");

                double kilowatt = value;
                _kilowatt.setText("Kilowatt: "+ new Double(kilowatt).toString());
                _kilowatt.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double watt = kilowatt*1000;
                _watt.setText("Watt: "+ new Double(watt).toString());
                _watt.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double hp =kilowatt*1.341022;
                _hp.setText("HP: "+ new Double(hp).toString());
                _hp.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                select_power.setSelection(0);


            }else if(item.equals("Watt")){


                Double value = Double.parseDouble((input_power.getText().toString()));
                input_power.setText("");

                double watt = value;
                _watt.setText("Watt: "+ new Double(watt).toString());
                _watt.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double kilowatt = watt/1000;
                _kilowatt.setText("Kilowatt: "+ new Double(kilowatt).toString());
                _kilowatt.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double hp =kilowatt*1.341022;
                _hp.setText("HP: "+ new Double(hp).toString());
                _hp.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                select_power.setSelection(0);


            }else if(item.equals("HP")){


                Double value = Double.parseDouble((input_power.getText().toString()));
                input_power.setText("");

                double hp =value;
                _hp.setText("HP: "+ new Double(hp).toString());
                _hp.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double watt = hp*745.6999;
                _watt.setText("Watt: "+ new Double(watt).toString());
                _watt.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double kilowatt = watt/1000;
                _kilowatt.setText("Kilowatt: "+ new Double(kilowatt).toString());
                _kilowatt.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                select_power.setSelection(0);


            }



        }catch (Exception e){
            e.printStackTrace();

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
