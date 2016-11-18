package com.android.don.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class hospitalList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);

        String[] Hospitals = {"Apollo Hospital","Bangabandhu Sheikh Mujib Medical University","Bangladesh Eye Hospital","IBN SINA Hospital","Japan Bangladesh Friendship Hospital","Medinova Diagonistic Center","POPULAR DIAGNOSTIC CENTRE LTD","Samorita Hospital","Square Hospitals Limited","United Hospital"};
        ListAdapter teamAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Hospitals);
        ListView teamlist = (ListView)findViewById(R.id.listView);
        teamlist.setAdapter(teamAdapter);

        teamlist.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String hnames = String.valueOf(parent.getItemAtPosition(position));
                        //Toast.makeText(hospitalList.this, hnames, Toast.LENGTH_LONG).show();

                        Intent i = new Intent(hospitalList.this, hospitalDetails.class);
                        String hname = hnames;
                        i.putExtra("hospital Details", hname);
                        startActivity(i);
                    }
                }
        );
    }

}
