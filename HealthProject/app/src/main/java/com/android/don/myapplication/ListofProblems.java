package com.android.don.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;


public class ListofProblems extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listof_problems);
        Bundle teamArray = getIntent().getExtras();
        if(teamArray==null){
            return;
        }

        String[] Problems = teamArray.getStringArray("myArray");
        ListAdapter teamAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Problems);
        ListView teamlist = (ListView)findViewById(R.id.mylistView);
        teamlist.setAdapter(teamAdapter);

        teamlist.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String Probs = String.valueOf(parent.getItemAtPosition(position));
                        //Toast.makeText(ListofProblems.this,Probs,Toast.LENGTH_LONG).show();

                        Intent i = new Intent(ListofProblems.this,Result.class);
                        String Suggetion = Probs;
                        i.putExtra("suggetion",Suggetion);
                        startActivity(i);
                    }
                }
        );
    }

}
