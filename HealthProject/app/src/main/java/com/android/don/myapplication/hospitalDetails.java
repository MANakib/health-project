package com.android.don.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class hospitalDetails extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_details);

        Bundle b = getIntent().getExtras();
        if(b==null)
        {
            return;
        }

        String n,d;
        final TextView hname= (TextView)findViewById(R.id.hName);
        final TextView Details= (TextView)findViewById(R.id.hDetails);
        String name = b.getString("hospital Details");

        if(name.equals("Square Hospitals Limited"))
        {
            n = name;
            d = "House # 01 , Road # 04 , Dhanmondi.\n" +
                    "Dhaka 1205, Bangladesh\n" +
                    "Phone:+88 02 58610793-8\n" +
                    "Phone:+88 02 58610793-8\n" +
                    "Fax:+88 02 9615497\n" +
                    "Email:info@labaidgroup.com\n" +
                    "Website:www.labaidgroup.com";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("Japan Bangladesh Friendship Hospital"))
        {
            n = name;
            d = "House 55, Road 3/A\n" +
                    "Sat Masjid Road\n" +
                    "Dhaka, Bangladesh\n" +
                    "Tel: (92-21) 967-2277, 967-6161";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("Apollo Hospital"))
        {
            n = name;
            d = "Plot 81, Block E\n" +
                    "Bashundhara R/A\n" +
                    "Dhaka, Bangladesh.\n" +
                    "Tel: (88-02) 989-1661/5";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("United Hospital"))
        {
            n = name;
            d = "House 15, Road 71\n" +
                    "Gulshan 2\n" +
                    "Dhaka, Bangladesh.\n" +
                    "Tel: (88-02) 883-6000, 883-6444";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("Samorita Hospital"))
        {
            n = name;
            d = "89/1, Panthapath, Dhaka-1215\n" +
                    "Bangladesh\n" +
                    "Telephone : 9131901 (Master line)\n" +
                    "Fax : 880-2-9129971\n" +
                    "E-mail : admin@samoritahospital.org\n" +
                    "Web : www.samoritahospital.org";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("Bangladesh Eye Hospital"))
        {
            n = name;
            d = "Dhanmondi Branch\n" +
                    "78, Satmasjid Road (Road#27),Dhanmondi, \n" +
                    "Dhaka, 1205, Bangladesh. \n" +
                    "Phone:+88 09666787878, +88 02-9102264\n" +
                    "Fax:+02 9101995 \n" +
                    "Mob:+88 01755660041, +88 01916629999\n" +
                    "Email: info@bdeyehospital.com\n\n" +
                    "Uttara Branch\n" +
                    "Plot#31, Road#14, Secttor#13, Uttara, \n" +
                    "Dhaka, Bangladesh. \n" +
                    "Phone:+88 09666787878, +88 02-8933041-2\n" +
                    "Fax:+02 9101995 \n" +
                    "Mob:+88 01755660041, +88 01916629999\n" +
                    "Email: info.uttara@bdeyehospital.com\n\n" +
                    "Rayerbazar Branch\n" +
                    "3/26/2B, Sultanganj, Rayerbazar\n" +
                    "(Opposite Sikder Medical College), \n" +
                    "Dhaka, Bangladesh. \n" +
                    "Phone:+88 09666787878, +88 01916629999\n" +
                    "Fax:+02 9101995 \n" +
                    "Mob:+88 01787665946\n" +
                    "Email:info.rayerbazar@bdeyehospital.com \n" +
                    "www.bdeyehospital.com";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("Bangabandhu Sheikh Mujib Medical University"))
        {
            n = name;
            d = "Bangabandhu Sheikh Mujib Medical University\n" +
                    "Shahbag, Dhaka-1000.";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("Medinova Diagonistic Center"))
        {
            n = name;
            d = "Dhanmondi\n" +
                    "House 71/A, Road 5/A\n" +
                    "Dhanmondi\n" +
                    "Dhaka, Bangladesh.\n" +
                    "Tel: (88-02) 862-0353/6, 862-4907/10\n\n"+
                    "Malibagh\n" +
                    "Hosaf Tower\n" +
                    "6/9 Outer Circular Road\n" +
                    "Malibagh\n" +
                    "Dhaka, Bangladesh.\n" +
                    "Tel: (88-02) 833-3811/13";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("IBN SINA Hospital"))
        {
            n = name;
            d = "House #64, Road #15/A,\n" +
                    "Dhanmondi, Dhaka 1209 \n" +
                    "email: info@ibnsinatrust.com\n" +
                    "\n" +
                    "For Patients Serial, Test and Report: phone: 8119514-5,8118526,8113709,8124236,8110706.\n" +
                    "Reception: 01823039800\n" +
                    "Cardiac Service: 01771241673\n" +
                    "Customer Care: 01824666536\n" +
                    "Emergency: 01766633012\n" +
                    "Momota(Gynae): 01817144611 \n" +
                    "ICU: 01817144612\n" +
                    "CCU: 01775918016";
            hname.setText(n);
            Details.setText(d);
        }
        else if(name.equals("POPULAR DIAGNOSTIC CENTRE LTD"))
        {
            n = name;
            d = "House 16, Road 2\n" +
                    "Dhanmondi.\n" +
                    "Dhaka, Bangladesh.\n" +
                    "Tel: (88-02) 966-9480, 966-1491/3";
            hname.setText(n);
            Details.setText(d);
        }
    }


}
