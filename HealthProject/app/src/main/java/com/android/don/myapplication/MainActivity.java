package com.android.don.myapplication;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.AlertDialog;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myButtonClicked(View view)
    {
        Intent i = new Intent(this,gridMenuPage.class);
        startActivity(i);
    }

    public void myButton2Clicked(View view)
    {
        Intent j = new Intent(this,mapActivity.class);
        startActivity(j);
    }

    public void impClick(View view)
    {
        Intent k = new Intent(this,hospitalList.class);

        startActivity(k);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.first:
                AlertDialog alertDialog1 = new AlertDialog.Builder(this).create();
                alertDialog1.setTitle("Information");
                alertDialog1.setMessage("This is A Health App for the people of Bangladesh.This app will help you to know what to do when you have an emergency. It will also calculate your BMI and Give you addresses of Hospitals. We will upgrade it with new features!!");
                alertDialog1.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog1.setIcon(R.drawable.info);
                alertDialog1.show();
                return true;
            case R.id.second:
                AlertDialog alertDialog2 = new AlertDialog.Builder(this).create();
                alertDialog2.setTitle("Special Thanks");
                alertDialog2.setMessage("For This project we are very thankful to our Protap Mahanta Sir.");
                alertDialog2.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog2.setIcon(R.drawable.info);
                alertDialog2.show();

                return true;
            case R.id.third:
                AlertDialog alertDialog3 = new AlertDialog.Builder(this).create();
                alertDialog3.setTitle("About US");
                alertDialog3.setMessage("Developers:\n1. Jihad hasan Joy - ULAB\n2. M. A. Nakib - ULAB\n3. Mobinul Islam Mobin -ULAB");
                alertDialog3.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alertDialog3.setIcon(R.drawable.info);
                alertDialog3.show();

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
