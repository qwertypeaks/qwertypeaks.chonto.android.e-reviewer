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

import com.jjoe64.graphview.series.PointsGraphSeries;

import java.lang.*;

public class CALC_IT extends AppCompatActivity {



    String formula[]=
            {
                    "I1","N2(I)","I2","N2(I)",
                    "E1","N2(E)","E2","N2(E)",
                    "Z1","N2(Z)","Z2","N2(Z)"
            };

    ArrayAdapter<String> adapter;

    double result=0;
    int val3=0,val2=0,val1=0,picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc__it);

        Spinner chooser=(Spinner)findViewById(R.id.spinner);


        final EditText given1=(EditText)findViewById(R.id.given1);
        final EditText given2=(EditText)findViewById(R.id.given2);
        final EditText given3=(EditText)findViewById(R.id.given3);

        Button calc = (Button)findViewById(R.id.calculate);
        Button clear = (Button)findViewById(R.id.clear);

        final TextView dis = (TextView)findViewById(R.id.dis);
        final TextView dis2 = (TextView)findViewById(R.id.give);
        final TextView dis3 = (TextView)findViewById(R.id.give2);
        final TextView dis4 = (TextView)findViewById(R.id.give3);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,formula);
        chooser.setAdapter(adapter);


        chooser.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    //FORMULA ONE
                    case 0:
                        dis2.setText("N2");
                        dis3.setText("I2");
                        dis4.setText("N2");
                        picker=1;
                        break;
                    case 1:
                        dis2.setText("I1");
                        dis3.setText("N1");
                        dis4.setText("I2");
                        picker=2;
                        break;
                    case 2:
                        dis2.setText("N2");
                        dis3.setText("N1");
                        dis4.setText("I1");
                        picker=3;
                        break;
                    case 3:
                        dis2.setText("I1");
                        dis3.setText("I2");
                        dis4.setText("N2");
                        picker=4;
                        break;
                    //FORMULA TWO
                    case 4:
                        dis2.setText("N2");
                        dis3.setText("I2");
                        dis4.setText("N2");
                        picker=5;
                        break;
                    case 5:
                        dis2.setText("I1");
                        dis3.setText("N1");
                        dis4.setText("I2");
                        picker=6;
                        break;
                    case 6:
                        dis2.setText("N2");
                        dis3.setText("N1");
                        dis4.setText("I1");
                        picker=7;
                        break;
                    case 7:
                        dis2.setText("I1");
                        dis3.setText("I2");
                        dis4.setText("N2");
                        picker=8;
                        break;
                    //FORMULA THREE
                    case 8:
                        dis2.setText("N2");
                        dis3.setText("I2");
                        dis4.setText("N2");
                        picker=9;
                        break;
                    case 9:
                        dis2.setText("I1");
                        dis3.setText("N1");
                        dis4.setText("I2");
                        picker=10;
                        break;
                    case 10:
                        dis2.setText("N2");
                        dis3.setText("N1");
                        dis4.setText("I1");
                        picker=11;
                        break;
                    case 11:
                        dis2.setText("I1");
                        dis3.setText("I2");
                        dis4.setText("N2");
                        picker=12;
                        break;
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        calc.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                try {
                    String h = given1.getText().toString();
                    String j = given2.getText().toString();
                    String l = given3.getText().toString();
                    val1 = Integer.parseInt(h);
                    val2 = Integer.parseInt(j);
                    val3 = Integer.parseInt(l);


                    //FORMULA ONE
                    if (picker == 1) result = I1(val1, val2, val3);
                    else if (picker == 2) result = N2I(val1, val2, val3);
                    else if (picker == 3) result = I2(val1, val2, val3);
                    else if (picker == 4) result = N1I(val1, val2, val3);
                        //FORMULA TWO
                    else if (picker == 5) result = E1(val1, val2, val3);
                    else if (picker == 6) result = N1E(val1, val2, val3);
                    else if (picker == 7) result = E2(val1, val2, val3);
                    else if (picker == 8) result = N2E(val1, val2, val3);
                        //FORMULA TWO
                    else if (picker == 9) result = Z1(val1, val2, val3);
                    else if (picker == 10) result = N1Z(val1, val2, val3);
                    else if (picker == 11) result = Z2(val1, val2, val3);
                    else if (picker == 12) result = N2Z(val1, val2, val3);

                    dis.setText(Double.toString(result));
                }catch (Exception e)
                {

                }
            }
        });

        clear.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                given1.setText("");
                given2.setText("");
                given3.setText("");
                dis.setText("");
                result=0;

            }
        });
    }
    //FORMULA ONE
    public int I1(int i,int j,int l){
        int result = (i*j)/l;
        return result;
    }
    public int N2I(int i,int j,int l){
        int result = (i*j)/l;
        return result;
    }
    public int I2(int i,int j,int l){
        int result = i/(j*l);
        return result;
    }
    public int N1I(int i,int j,int l){
        int result = i/(j*l);
        return result;
    }

    //FORMULA TWO
    public int E1(int i,int j,int l){
        int result = (i*j)/l;
        return result;
    }
    public int N1E(int i,int j,int l){
        int result = (i*j)/l;
        return result;
    }
    public int E2(int i,int j,int l){
        int result = i/(j*l);
        return result;
    }
    public int N2E(int i,int j,int l){
        int result = i/(j*l);
        return result;
    }

    //FORMULA THREE
    public double Z1(int i,int j,int l){
        int result = ((i*i)*j)/(l*l);
        double res = Double.valueOf(result);
        return res;
    }
    public double N1Z(int i,int j,int l){
        int result = (i*j)/l;
        double res = Double.valueOf(result);
        return res;
    }
    public double Z2(int i,int j,int l){
        int result = (i*i)/((j*j)*l);
        double res = Double.valueOf(result);
        return res;
    }
    public double N2Z(int i,int j,int l){
        int result = i/(j*(l*l));
        double res = Math.sqrt(Double.valueOf(result));
        return res;
    }


    public void onClick(View view) {
        Intent i = new Intent(this, CALC_SELECTOR.class);
        startActivity(i);
    }

}
