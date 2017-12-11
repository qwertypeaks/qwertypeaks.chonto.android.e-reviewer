package com.chonto.electriciansextremee_reviewer;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class CUSTOM_ADAPTER extends ArrayAdapter<String> {


    public CUSTOM_ADAPTER(Context context, String[] bank) {
        super(context, R.layout.custom_layout,bank);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater  mehinflater = LayoutInflater.from(getContext());
        View customView = mehinflater.inflate(R.layout.custom_layout,parent,false);

        String bankItem = getItem(position);
        TextView click = (TextView) customView.findViewById(R.id.button_listview);

        click.setText(bankItem);
        return customView;
    }

}
