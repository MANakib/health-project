package com.android.don.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class gridMenuPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_menu_page);


    }



    public void headClick(View view){
        String[] Prob = {"Headache","Migraine" };
        Bundle b = new Bundle();
        b.putStringArray("myArray",Prob);
        Intent i = new Intent(this,ListofProblems.class);
        i.putExtras(b);
        startActivity(i);
    }

    public void eyeClick(View view){
        String[] Prob = {"Eyeache","Eye Rash" };
        Bundle b = new Bundle();
        b.putStringArray("myArray",Prob);
        Intent i = new Intent(this,ListofProblems.class);
        i.putExtras(b);
        startActivity(i);
    }

    public void noseClick(View view){
        String[] Prob = {"Cold","Polypus" };
        Bundle b = new Bundle();
        b.putStringArray("myArray",Prob);
        Intent i = new Intent(this,ListofProblems.class);
        i.putExtras(b);
        startActivity(i);
    }

    public void earClick(View view){
        String[] Prob = {"Earache","Downgrade of Hearing" };
        Bundle b = new Bundle();
        b.putStringArray("myArray",Prob);
        Intent i = new Intent(this,ListofProblems.class);
        i.putExtras(b);
        startActivity(i);
    }

    public void throatClick(View view){
        String[] Prob = {"Tonsil","Stucked Cough" };
        Bundle b = new Bundle();
        b.putStringArray("myArray",Prob);
        Intent i = new Intent(this,ListofProblems.class);
        i.putExtras(b);
        startActivity(i);
    }

    public void teethClick(View view){
        String[] Prob = {"Toothache","Blood From Teeth" };
        Bundle b = new Bundle();
        b.putStringArray("myArray",Prob);
        Intent i = new Intent(this,ListofProblems.class);
        i.putExtras(b);
        startActivity(i);
    }

    public void othersClick(View view){
        String[] Prob = {"Fever","Jaundice","Cough", "Food Poisoning", "Diarrhoea", "Pain","Worm","Asthma" };
        Bundle b = new Bundle();
        b.putStringArray("myArray",Prob);
        Intent i = new Intent(this,ListofProblems.class);
        i.putExtras(b);
        startActivity(i);
    }



}
