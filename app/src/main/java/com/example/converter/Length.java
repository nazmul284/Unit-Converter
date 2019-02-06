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

public class Length extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText input_length;
    Spinner seclct_length;
    TextView meter,centimeter,kilometer,inche,feet,mile;
    List<String> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        input_length = (EditText)findViewById(R.id.input_length);

        seclct_length = (Spinner) findViewById(R.id.select_length);

        meter = (TextView) findViewById(R.id.meter);
        centimeter = (TextView)findViewById(R.id.centimeter);
        kilometer = (TextView)findViewById(R.id.kilometer);
        inche = (TextView)findViewById(R.id.inche);
        feet = (TextView)findViewById(R.id.feet);
        mile = (TextView)findViewById(R.id.mile);

        seclct_length.setOnItemSelectedListener(this);

        items = new ArrayList<String>();
        items.add("Select");
        items.add("Feet");
        items.add("Inche");
        items.add("Meter");
        items.add("Centimeter");
        items.add("Kilometer");
        items.add("Miles");


        ArrayAdapter<String> lengthAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,items);
        lengthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seclct_length.setAdapter(lengthAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = (String)parent.getItemAtPosition(position).toString();

        try{

            if(item.equals("Meter")){
                double value = Double.parseDouble(input_length.getText().toString());
                input_length.setText("");

                double met = value;
                meter.setText("Meter: " + new Double(met).toString());
                meter.setTextColor(getResources().getColor(R.color.temp_bg));

                double cent = met*100;
                centimeter.setText("Centimeter: " + new Double(cent).toString());
                centimeter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double km = (met / 1000);
                kilometer.setText("Kilometer: " + new Double(km).toString());
                kilometer.setTextColor(getResources().getColor(R.color.temp2_bg));


                double mil = km*0.62;
                mile.setText("Mile: " + new Double(mil).toString());
                mile.setTextColor(getResources().getColor(R.color.temp2_bg));

                double in = cent/2.54;
                inche.setText("Inche: " + new Double(in).toString());
                inche.setTextColor(getResources().getColor(R.color.temp2_bg));

                double fet = in/12;
                feet.setText("Feet: " + new Double(fet).toString());
                feet.setTextColor(getResources().getColor(R.color.temp2_bg));


            }else if (item.equals("Centimeter")){


                double value = Double.parseDouble(input_length.getText().toString());
                input_length.setText("");

                double cent = value;
                centimeter.setText("Centimeter: " + new Double(cent).toString());
                centimeter.setTextColor(getResources().getColor(R.color.temp_bg));

                double met = cent/100;
                meter.setText("Meter: " + new Double(met).toString());
                meter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double km = (met / 1000);
                kilometer.setText("Kilometer: " + new Double(km).toString());
                kilometer.setTextColor(getResources().getColor(R.color.temp2_bg));


                double mil = km*0.62137;
                mile.setText("Mile: " + new Double(mil).toString());
                mile.setTextColor(getResources().getColor(R.color.temp2_bg));

                double in = cent/2.54;
                inche.setText("Inche: " + new Double(in).toString());
                inche.setTextColor(getResources().getColor(R.color.temp2_bg));

                double fet = in/12;
                feet.setText("Feet: " + new Double(fet).toString());
                feet.setTextColor(getResources().getColor(R.color.temp2_bg));

            }else if (item.equals("Kilometer")){


                double value = Double.parseDouble(input_length.getText().toString());
                input_length.setText("");

                double km = value;
                kilometer.setText("Kilometer: " + new Double(km).toString());
                kilometer.setTextColor(getResources().getColor(R.color.temp_bg));

                double met = km/1000;
                meter.setText("Meter: " + new Double(met).toString());
                meter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double cent = met*100;
                centimeter.setText("Centimeter: " + new Double(cent).toString());
                centimeter.setTextColor(getResources().getColor(R.color.temp2_bg));


                double mil = km*0.62137;
                mile.setText("Mile: " + new Double(mil).toString());
                mile.setTextColor(getResources().getColor(R.color.temp2_bg));

                double in = cent/2.54;
                inche.setText("Inche: " + new Double(in).toString());
                inche.setTextColor(getResources().getColor(R.color.temp2_bg));

                double fet = in/12;
                feet.setText("Feet: " + new Double(fet).toString());
                feet.setTextColor(getResources().getColor(R.color.temp2_bg));

            }else if (item.equals("Miles")){


                double value = Double.parseDouble(input_length.getText().toString());
                input_length.setText("");


                double mil = value;
                mile.setText("Mile: " + new Double(mil).toString());
                mile.setTextColor(getResources().getColor(R.color.temp_bg));

                double km = mil/0.62137;
                kilometer.setText("Kilometer: " + new Double(km).toString());
                kilometer.setTextColor(getResources().getColor(R.color.temp2_bg));

                double met = km/1000;
                meter.setText("Meter: " + new Double(met).toString());
                meter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double cent = met*100;
                centimeter.setText("Centimeter: " + new Double(cent).toString());
                centimeter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double in = cent/2.54;
                inche.setText("Inche: " + new Double(in).toString());
                inche.setTextColor(getResources().getColor(R.color.temp2_bg));

                double fet = in/12;
                feet.setText("Feet: " + new Double(fet).toString());
                feet.setTextColor(getResources().getColor(R.color.temp2_bg));

            }else if (item.equals("Inche")){


                double value = Double.parseDouble(input_length.getText().toString());
                input_length.setText("");

                double in = value;
                inche.setText("Inche: " + new Double(in).toString());
                inche.setTextColor(getResources().getColor(R.color.temp_bg));

                double cent = in*2.54;
                centimeter.setText("Centimeter: " + new Double(cent).toString());
                centimeter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double met = cent/100;
                meter.setText("Meter: " + new Double(met).toString());
                meter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double km = met/1000;
                kilometer.setText("Kilometer: " + new Double(km).toString());
                kilometer.setTextColor(getResources().getColor(R.color.temp2_bg));


                double mil = km*0.62137;
                mile.setText("Mile: " + new Double(mil).toString());
                mile.setTextColor(getResources().getColor(R.color.temp2_bg));

                double fet = in/12;
                feet.setText("Feet: " + new Double(fet).toString());
                feet.setTextColor(getResources().getColor(R.color.temp2_bg));

            }else if (item.equals("Feet")){


                double value = Double.parseDouble(input_length.getText().toString());
                input_length.setText("");

                double fet = value;
                feet.setText("Feet: " + new Double(fet).toString());
                feet.setTextColor(getResources().getColor(R.color.temp_bg));

                double in = fet/12;
                inche.setText("Inche: " + new Double(in).toString());
                inche.setTextColor(getResources().getColor(R.color.temp2_bg));

                double cent = in*2.54;
                centimeter.setText("Centimeter: " + new Double(cent).toString());
                centimeter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double met = cent/100;
                meter.setText("Meter: " + new Double(met).toString());
                meter.setTextColor(getResources().getColor(R.color.temp2_bg));

                double km = met/1000;
                kilometer.setText("Kilometer: " + new Double(km).toString());
                kilometer.setTextColor(getResources().getColor(R.color.temp2_bg));


                double mil = km*0.62137;
                mile.setText("Mile: " + new Double(mil).toString());
                mile.setTextColor(getResources().getColor(R.color.temp2_bg));

            }



        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
