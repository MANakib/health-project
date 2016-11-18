package com.android.don.myapplication;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class mapActivity extends ActionBarActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void checkButtonClicked(View view)
    {
        RadioButton maleRadioButton, femaleRadioButton;
        EditText height = (EditText)findViewById(R.id.editText);
        EditText weight = (EditText)findViewById(R.id.editText2);
        TextView show = (TextView) findViewById(R.id.resultView);
        show.setMovementMethod(new ScrollingMovementMethod());
        double h,w;
        double result;
        maleRadioButton = (RadioButton) findViewById(R.id.maleRadio);
        femaleRadioButton = (RadioButton) findViewById(R.id.femaleRadio);
        if (maleRadioButton.isChecked()) {
            h = Double.parseDouble(height.getText().toString());
            w = Double.parseDouble(weight.getText().toString());
            result = (w/((h*0.025)*(h*0.025)));

            if (result < 18.500) {
                show.setText("You are quite lighter with respect to your Height. you Height. Take Some food!!");
            }
            else if (result < 25.000) {
                show.setText("You are Normal with respect to your Height. Keep It Up!!!!");
            } else if (result < 30.000) {
                show.setText("You are Overweight. Keep Dieting to Be feet!!");
            }
            else if (result>30.000){
                show.setText("Your weight is too much with respect to your Height. Start exercising and maintain a healthy life and food habit.");
            }

        }
        else if (femaleRadioButton.isChecked())
        {
            h = Double.parseDouble(height.getText().toString());
            w = Double.parseDouble(weight.getText().toString());
            result = (h/((w*0.025)*(w*0.025)));
            Toast.makeText(mapActivity.this, "Answer is " + result, Toast.LENGTH_LONG);
            if (result < 16.500) {
                show.setText("You are quite lighter with respect to your Height. you Height. Take Some food!!");
            }
            else if (result < 22.000) {
                show.setText("You are Normal with respect to your Height. Keep It Up!!!!");
            } else if (result < 27.000) {
                show.setText("You are Overweight. Keep Dieting to Be feet!!");
            } else if (result>30.000){
                show.setText("Your weight is too much with respect to your Height. Start exercising and maintain a healthy life and food habit.");
            }
        }

        else {
            Toast.makeText(getApplicationContext(), "Select A Gender", Toast.LENGTH_SHORT).show();

        }
    }


}
