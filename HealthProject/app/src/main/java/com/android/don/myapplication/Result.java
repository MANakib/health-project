package com.android.don.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Result extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle b = getIntent().getExtras();
        if(b==null)
        {
            return;
        }

        String sug;
        String ass;
        final TextView s= (TextView)findViewById(R.id.sstext);
        final TextView a= (TextView)findViewById(R.id.aatext);
        s.setMovementMethod(new ScrollingMovementMethod());
        a.setMovementMethod(new ScrollingMovementMethod());
        String name = b.getString("suggetion");

        if(name.equals("Headache"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\nWhen U will have a headache. First You have to keep yourself calm.Try to sleep. If you still feel bad, U can take these :\n1. Dispirin - 500 MG - When pain will be felt\n2. Headache Oinments";
            ass = "Prof. Md. Abu Siddique\n" +
                    "Professor\n" +
                    "Email: drabusiddique@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Migraine"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a Migrain. First You have to keep yourself calm.Try to sleep. If you still feel bad, U can take these :\n" +
                    "1. Fluricet\n" +
                    "2. Relpax";
            ass = "Prof. Md. Abu Siddique\n" +
                    "Professor\n" +
                    "Email: drabusiddique@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Eyeache"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a Eyeache. Dont later. Quickly Consult a doctor and Dont touch your eyes.";
            ass = "\n" +
                    "Dr. Mahbubur Rahman Chowdhury  MBBS, FCPS(1991)\n" +
                    "Cataract & Comprehensive Ophthalmology\n" +
                    "Fellowship in Phaco Surgery, Rahgudeep Eye Clinic, Ahmadabad, India\n" +
                    "Fellowship in Phaco Surgery, LV Prasad Eye Institute, Hyderabad, India Phaco Surgery";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Eye Rash"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a Eyeache. Dont later. Quickly Consult a doctor and Dont touch your eyes.";
            ass = "\n" +
                    "Dr. Mahbubur Rahman Chowdhury  MBBS, FCPS(1991)\n" +
                    "Cataract & Comprehensive Ophthalmology\n" +
                    "Fellowship in Phaco Surgery, Rahgudeep Eye Clinic, Ahmadabad, India\n" +
                    "Fellowship in Phaco Surgery, LV Prasad Eye Institute, Hyderabad, India Phaco Surgery"+
                    "Bangladesh Eye Hospital";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Cold"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will get Cold. . Dont get near cold water. If you still feel bad, U can take these :\n" +
                    "1. Napa - 4 times\n" +
                    "2. Nossel- 4 spray - Twice A day";
            ass = "Prof. Syed Ali Ahsan\n" +
                    "Professor\n" +
                    "Email: draliahsan@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Polypus"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a Eyeache. Dont late. Quickly Consult a doctor";
            ass = "Prof. Asia Khanam \n" +
                    "Professor\n" +
                    "Email: asiakhanamdr@gmail.com!!";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Earache"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a Eyeache. Dont late. Quickly Consult a doctor";
            ass = "Prof. Syed Ali Ahsan\n" +
                    "Professor\n" +
                    "Email: draliahsan@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Downgrade of Hearing"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a problem with Hearing, Dont late. Quickly Consult a doctor";
            ass = "Prof. Syed Ali Ahsan\n" +
                    "Professor\n" +
                    "Email: draliahsan@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Tonsil"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a tonsil or Pain of Tonsil, Dont late. Quickly Consult a doctor";
            ass = "Prof. Syed Ali Ahsan\n" +
                    "Professor\n" +
                    "Email: draliahsan@yahoo.com";;
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Stucked Cough"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a Stocked Cough. Avoid any type of cold water. Dont drink or Use. Also Take hot water with salt/";
            ass = "Prof. Syed Ali Ahsan\n" +
                    "Professor\n" +
                    "Email: draliahsan@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Toothache"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have have a toothache, Try not to poke your teeth with anything and Avoid cold things. Consult a Dentist Fast! ";
            ass = "Dr. Mohammed Shafi Ullah\n" +
                    "Qualification : MBBS, MS, BDS, MCPS, MDRA(USA)\n" +
                    "Chamber: Islami Bank Central Hospital\n" +
                    "Location: 30, Anjuman Mafidul Islam Road, Kakrail , Dhaka-1000\n" +
                    "Phone: +880-2-9355801-2, 9360331-2 ";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Blood From Teeth"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have have blood from teeth, Try not to poke your teeth with anything and Avoid cold things. Consult a Dentist Fast! ";
            ass = "Dr. Mohammed Shafi Ullah\n" +
                    "Qualification : MBBS, MS, BDS, MCPS, MDRA(USA)\n" +
                    "Chamber: Islami Bank Central Hospital\n" +
                    "Location: 30, Anjuman Mafidul Islam Road, Kakrail , Dhaka-1000\n" +
                    "Phone: +880-2-9355801-2, 9360331-2 ";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Fever"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When You will have a fever. Take Proper Rest. Do not work or Do Activities which will make you more weak.and take these if neccessary\n1. Perasitamol\n2. Ace Plus";
            ass = "Prof. Md. Qamrul Hasan Jaigirdar\n" +
                    "Professor\n" +
                    "Email: j.kamran@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Jaundice"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a problem with Hearing, Dont late. Quickly Consult a doctor. And take a lot of Rest.";
            ass = "Prof. Md. Qamrul Hasan Jaigirdar\n" +
                    "Professor\n" +
                    "Email: j.kamran@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Cough"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a Cough. First You have to keep yourself calm.Try to sleep. Dont take cold water or drinks. Keep yourself dry.";
            ass = "Prof. Md. Qamrul Hasan Jaigirdar\n" +
                    "Professor\n" +
                    "Email: j.kamran@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Food Poisoning"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have Diarrhoea ,Drink as much water you can. And also drink home made or bought saline a lot,";
            ass = "Prof. Md. Qamrul Hasan Jaigirdar\n" +
                    "Professor\n" +
                    "Email: j.kamran@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Diarrhoea"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have Diarrhoea ,Drink as much water you can. And also drink home made or bought saline a lot,";
            ass = "Prof. Md. Qamrul Hasan Jaigirdar\n" +
                    "Professor\n" +
                    "Email: j.kamran@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Pain"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "If You feel any pain in any of your body part, Try Oinments and Pain Killers. If it starts to grow then U can take the followings\n1. Perasitamol\n2. Ecilias";
            ass = "Prof. Md. Qamrul Hasan Jaigirdar\n" +
                    "Professor\n" +
                    "Email: j.kamran@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Worm"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will be affected by worm. Dont eat any unhygienic or Oily food. Take Proper Rest and Drink Pure Water.";
            ass = "Prof. Md. Qamrul Hasan Jaigirdar\n" +
                    "Professor\n" +
                    "Email: j.kamran@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }
        else if(name.equals("Asthma"))
        {
            sug = "**PLEASE FIRST TAKE DOCTOR'S ADVICE BEFORE TAKING ANY OF THESE**\n" +
                    "When U will have a problem with Asthma, Dont late. Quickly Consult a doctor";
            ass = "Prof. Md. Qamrul Hasan Jaigirdar\n" +
                    "Professor\n" +
                    "Email: j.kamran@yahoo.com";
            s.setText(sug);
            a.setText(ass);
        }





    }
}
