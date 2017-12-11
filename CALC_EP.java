package com.chonto.electriciansextremee_reviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CALC_EP extends AppCompatActivity {


    String formula[]={"I^2R","EI","E^2/I"};
    ArrayAdapter<String> adapter;
    int result=0,val2=0,val1=0,picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc__ep);

        Spinner chooser=(Spinner)findViewById(R.id.spinner);

        final EditText given1=(EditText)findViewById(R.id.given1);
        final EditText given2=(EditText)findViewById(R.id.given2);

        Button calc = (Button)findViewById(R.id.calculate);
        Button clear = (Button)findViewById(R.id.clear);

        final TextView dis = (TextView)findViewById(R.id.dis);
        final TextView dis2 = (TextView)findViewById(R.id.give);
        final TextView dis3 = (TextView)findViewById(R.id.give2);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,formula);
        chooser.setAdapter(adapter);


       chooser.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        dis2.setText("Current");
                        dis3.setText("Resistance");
                        picker=1;
                        break;
                    case 1:
                        dis2.setText("Voltage");
                        dis3.setText("Current");
                        picker=2;
                        break;
                    case 2:
                        dis2.setText("Voltage");
                        dis3.setText("Current");
                        picker=3;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        calc.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                try{
                String h = given1.getText().toString();
                String j = given2.getText().toString();
                if (h != "" && j != "")
                {
                val1 = Integer.parseInt(h);
                val2 = Integer.parseInt(j);
                    if (picker == 1) result = c(val1, val2);
                    if (picker == 2) result = cc(val1, val2);
                    if (picker == 3) result = ccc(val1, val2);

                    dis.setText(Integer.toString(result));
                }
                }catch (Exception e)
                {

                }
            }
        });

        clear.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                given1.setText("");
                given2.setText("");
                dis.setText("");
                result=0;

            }
        });
}
    public int c(int i,int j){
        int result = (i*i)*j;
        return result;
    }

    public int cc(int i,int j){
        int result = i*j;
        return result;
    }

    public int ccc(int i,int j){
        int result = (i*i)/j;
        return result;
    }
    public void onClick(View view) {
        Intent i = new Intent(this, CALC_SELECTOR.class);
        startActivity(i);
    }

}
