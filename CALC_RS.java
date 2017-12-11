package com.chonto.electriciansextremee_reviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CALC_RS extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_rs);

        final EditText value = (EditText)findViewById(R.id.addValue);
        final ListView display = (ListView)findViewById(R.id.display);
        final TextView result = (TextView)findViewById(R.id.result);
        final Button calculate = (Button)findViewById(R.id.calculate);
        final Button addValue = (Button)findViewById(R.id.insertValue);
        result.setText("");
        final ArrayList<Integer> values = new ArrayList<>();


        // adapter
        final ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_list_item_1,values);
        display.setAdapter(adapter);

        //add value
        addValue.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                    int val = Integer.parseInt(value.getText().toString());
                    values.add(val);
                    value.setText("");
                }
        }

        );

        //calculate value

        calculate.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                    float sum=0;
                    for(int i = 0;i < values.size();i++){
                    sum += values.get(i);
                }
                    result.setText(Float.toString(sum)+"Ω");
        }
        });

    }
    public void onClick(View view) {
        Intent i = new Intent(this, CALC_SELECTOR.class);
        startActivity(i);
    }

}
