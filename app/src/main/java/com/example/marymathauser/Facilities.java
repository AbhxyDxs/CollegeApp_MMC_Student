package com.example.marymathauser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Facilities extends AppCompatActivity implements View.OnClickListener {

    CardView ncc, nss, wws, ssp, asap, ignou;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);
        ncc = findViewById(R.id.ncc);
        nss = findViewById(R.id.nss);
        wws = findViewById(R.id.wws);
        ssp = findViewById(R.id.ssp);
        asap = findViewById(R.id.asap);
        ignou = findViewById(R.id.ignu);

        ncc.setOnClickListener(this);
        nss.setOnClickListener(this);
        wws.setOnClickListener(this);
        asap.setOnClickListener(this);
        ssp.setOnClickListener(this);
        ignou.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.ncc:
                LayoutInflater inflater = LayoutInflater.from(this);
                View view1 = inflater.inflate(R.layout.ncclayout, null);

                Button b2 = view1.findViewById(R.id.button2);


                AlertDialog alertDialog = new AlertDialog.Builder(this)
                        .setView(view1)
                        .create();
                alertDialog.setCancelable(false);
                alertDialog.show();
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.cancel();
                    }
                });
                break;
            case R.id.nss:
                LayoutInflater inflater2 = LayoutInflater.from(this);
                View view2 = inflater2.inflate(R.layout.nss, null);

                Button b3 = view2.findViewById(R.id.button2);


                AlertDialog alertDialog1 = new AlertDialog.Builder(this)
                        .setView(view2)
                        .create();
                alertDialog1.setCancelable(false);
                alertDialog1.show();
                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog1.cancel();
                    }
                });
                break;
            case R.id.asap:
                LayoutInflater inflater3 = LayoutInflater.from(this);
                View view3 = inflater3.inflate(R.layout.asap, null);

                Button b4 = view3.findViewById(R.id.button2);


                AlertDialog alertDialog3 = new AlertDialog.Builder(this)
                        .setView(view3)
                        .create();
                alertDialog3.setCancelable(false);
                alertDialog3.show();
                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog3.cancel();
                    }
                });
                break;
            case R.id.wws:
                LayoutInflater inflater4 = LayoutInflater.from(this);
                View view4 = inflater4.inflate(R.layout.wws, null);

                Button b5 = view4.findViewById(R.id.button2);


                AlertDialog alertDialog4 = new AlertDialog.Builder(this)
                        .setView(view4)
                        .create();
                alertDialog4.setCancelable(false);
                alertDialog4.show();
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog4.cancel();
                    }
                });
                break;
            case R.id.ssp:
                LayoutInflater inflater5 = LayoutInflater.from(this);
                View view5 = inflater5.inflate(R.layout.ssp, null);

                Button b6 = view5.findViewById(R.id.button2);


                AlertDialog alertDialog5 = new AlertDialog.Builder(this)
                        .setView(view5)
                        .create();
                alertDialog5.setCancelable(false);
                alertDialog5.show();
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog5.cancel();
                    }
                });
                break;
            case R.id.ignu:
                LayoutInflater inflater6 = LayoutInflater.from(this);
                View view6 = inflater6.inflate(R.layout.ignou, null);

                Button b7 = view6.findViewById(R.id.button2);


                AlertDialog alertDialog6 = new AlertDialog.Builder(this)
                        .setView(view6)
                        .create();
                alertDialog6.setCancelable(false);
                alertDialog6.show();
                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog6.cancel();
                    }
                });
                break;


        }


    }
}