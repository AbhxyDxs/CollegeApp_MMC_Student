package com.example.marymathauser;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class DeparmentActivity extends AppCompatActivity {
    CardView csd,matd,phd,zood,mld,hind,chd,btd,plt,jrn,sts,end,pdd,cmd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deparment);

        csd = findViewById(R.id.csd);
        end = findViewById(R.id.end);
        jrn = findViewById(R.id.jrd);
        plt = findViewById(R.id.polid);
        matd = findViewById(R.id.matd);
        sts = findViewById(R.id.std);
        zood = findViewById(R.id.zood);
        btd = findViewById(R.id.btd);
        cmd = findViewById(R.id.cmd);
        phd = findViewById(R.id.phd);
        chd = findViewById(R.id.chd);
        hind = findViewById(R.id.hind);
        mld = findViewById(R.id.mld);
        pdd = findViewById(R.id.ped);
    }
}