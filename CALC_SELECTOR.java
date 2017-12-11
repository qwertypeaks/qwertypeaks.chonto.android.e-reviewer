package com.chonto.electriciansextremee_reviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CALC_SELECTOR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc_selector);
    }


    public void onClick(View view) {
        Intent i = new Intent(this,HOME.class);
        startActivity(i);
    }
    public void onClick2(View view) {
        Intent i = new Intent(this,CALC_RS.class);
        startActivity(i);
    }
    public void onClick3(View view) {
        Intent i = new Intent(this,CALC_RP.class);
        startActivity(i);
    }
    public void onClick4(View view) {
        Intent i = new Intent(this,CALC_CS.class);
        startActivity(i);
    }
    public void onClick5(View view) {
        Intent i = new Intent(this,CALC_OHMS_LAW.class);
        startActivity(i);
    }
    public void onClick6(View view) {
        Intent i = new Intent(this,CALC_EP.class);
        startActivity(i);
    }
    public void onClick7(View view) {
        Intent i = new Intent(this,CALC_VD.class);
        startActivity(i);
    }
    public void onClick8(View view) {
        Intent i = new Intent(this,CALC_IT.class);
        startActivity(i);
    }
}
