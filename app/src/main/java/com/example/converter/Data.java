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

public class Data extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText input_data;
    Spinner seclct_data;
    TextView bit,byte_,kb,mb,gb,tb;
    List<String> items;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        input_data = (EditText) findViewById(R.id.input_data);

        bit = (TextView)findViewById(R.id.bit);
        byte_ = (TextView)findViewById(R.id.byte_);
        kb = (TextView)findViewById(R.id.kb);
        mb = (TextView)findViewById(R.id.mb);
        gb = (TextView)findViewById(R.id.gb);
        tb = (TextView)findViewById(R.id.tb);

        seclct_data = (Spinner)findViewById(R.id.select_data);

        seclct_data.setOnItemSelectedListener(this);

        items = new ArrayList<String>();

        items.add("Select");
        items.add("Bit");
        items.add("Byte");
        items.add("KB");
        items.add("MB");
        items.add("GB");
        items.add("TB");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,items);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seclct_data.setAdapter(dataAdapter);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item = (String)parent.getItemAtPosition(position).toString();




        try {

            if(item.equals("Bit")){

                Double value = Double.parseDouble(input_data.getText().toString());
                input_data.setText("");

                double bit_value = value;
                bit.setText("Bit: "+ new Double(bit_value).toString());
                bit.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double byte_value = (value/8);
                byte_.setText("Byte: "+ new Double(byte_value).toString());
                byte_.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double kb_value = (byte_value/1024);
                kb.setText("KB: "+ new Double(kb_value).toString());
                kb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double mb_value = (kb_value/1024);
                mb.setText("MB: "+ new Double(mb_value).toString());
                mb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double gb_value = (mb_value/1024);
                gb.setText("GB: "+ new Double(gb_value).toString());
                gb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double tb_value = (gb_value/1024);
                tb.setText("TB: "+ new Double(tb_value).toString());
                tb.setTextColor(this.getResources().getColor(R.color.temp2_bg));


            }else if (item.equals("Byte")){


                Double value = Double.parseDouble(input_data.getText().toString());
                input_data.setText("");

                double bit_value = value*8;
                bit.setText("Bit: "+ new Double(bit_value).toString());
                bit.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double byte_value = value;
                byte_.setText("Byte: "+ new Double(byte_value).toString());
                byte_.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double kb_value = (byte_value/1024);
                kb.setText("KB: "+ new Double(kb_value).toString());
                kb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double mb_value = (kb_value/1024);
                mb.setText("MB: "+ new Double(mb_value).toString());
                mb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double gb_value = (mb_value/1024);
                gb.setText("GB: "+ new Double(gb_value).toString());
                gb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double tb_value = (gb_value/1024);
                tb.setText("TB: "+ new Double(tb_value).toString());
                tb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

            }else if (item.equals("KB")){


                Double value = Double.parseDouble(input_data.getText().toString());
                input_data.setText("");

                double kb_value = value;
                kb.setText("KB: "+ new Double(kb_value).toString());
                kb.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double byte_value = kb_value*1024;
                byte_.setText("Byte: "+ new Double(byte_value).toString());
                byte_.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double bit_value = byte_value*8;
                bit.setText("Bit: "+ new Double(bit_value).toString());
                bit.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double mb_value = (kb_value/1024);
                mb.setText("MB: "+ new Double(mb_value).toString());
                mb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double gb_value = (mb_value/1024);
                gb.setText("GB: "+ new Double(gb_value).toString());
                gb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double tb_value = (gb_value/1024);
                tb.setText("TB: "+ new Double(tb_value).toString());
                tb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

            }else if (item.equals("MB")){


                Double value = Double.parseDouble(input_data.getText().toString());
                input_data.setText("");

                double mb_value = value;
                mb.setText("MB: "+ new Double(mb_value).toString());
                mb.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double kb_value = mb_value/1024;
                kb.setText("KB: "+ new Double(kb_value).toString());
                kb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double byte_value = kb_value*1024;
                byte_.setText("Byte: "+ new Double(byte_value).toString());
                byte_.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double bit_value = byte_value*8;
                bit.setText("Bit: "+ new Double(bit_value).toString());
                bit.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double gb_value = (mb_value/1024);
                gb.setText("GB: "+ new Double(gb_value).toString());
                gb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double tb_value = (gb_value/1024);
                tb.setText("TB: "+ new Double(tb_value).toString());
                tb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

            }else if (item.equals("GB")){


                Double value = Double.parseDouble(input_data.getText().toString());
                input_data.setText("");

                double gb_value = value;
                gb.setText("GB: "+ new Double(gb_value).toString());
                gb.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double mb_value = gb_value*1024;
                mb.setText("MB: "+ new Double(mb_value).toString());
                mb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double kb_value = mb_value/1024;
                kb.setText("KB: "+ new Double(kb_value).toString());
                kb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double byte_value = kb_value*1024;
                byte_.setText("Byte: "+ new Double(byte_value).toString());
                byte_.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double bit_value = byte_value*8;
                bit.setText("Bit: "+ new Double(bit_value).toString());
                bit.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double tb_value = (gb_value/1024);
                tb.setText("TB: "+ new Double(tb_value).toString());
                tb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

            }else if (item.equals("TB")){


                Double value = Double.parseDouble(input_data.getText().toString());
                input_data.setText("");

                double tb_value = value;
                tb.setText("TB: "+ new Double(tb_value).toString());
                tb.setTextColor(this.getResources().getColor(R.color.temp_bg));

                double gb_value = tb_value*1024;
                gb.setText("GB: "+ new Double(gb_value).toString());
                gb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double mb_value = gb_value*1024;
                mb.setText("MB: "+ new Double(mb_value).toString());
                mb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double kb_value = mb_value/1024;
                kb.setText("KB: "+ new Double(kb_value).toString());
                kb.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double byte_value = kb_value*1024;
                byte_.setText("Byte: "+ new Double(byte_value).toString());
                byte_.setTextColor(this.getResources().getColor(R.color.temp2_bg));

                double bit_value = byte_value*8;
                bit.setText("Bit: "+ new Double(bit_value).toString());
                bit.setTextColor(this.getResources().getColor(R.color.temp2_bg));

            }


        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
