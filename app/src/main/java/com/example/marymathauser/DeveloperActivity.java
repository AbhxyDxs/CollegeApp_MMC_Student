package com.example.marymathauser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DeveloperActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView fb, insta, twtr, git, gmal, web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        getSupportActionBar().setTitle("Developers");

        fb = findViewById(R.id.fb);
        insta = findViewById(R.id.insta);
        twtr = findViewById(R.id.twt);
        git = findViewById(R.id.git);
        gmal = findViewById(R.id.gmil);
        web = findViewById(R.id.web);


        fb.setOnClickListener(this);
        insta.setOnClickListener(this);
        twtr.setOnClickListener(this);
        git.setOnClickListener(this);
        gmal.setOnClickListener(this);
        web.setOnClickListener(this);


    }
    public void onClick(View view){

        Intent intent;
        Uri uri;
        switch (view.getId()){

            case R.id.fb:
                 uri = Uri.parse("https://www.facebook.com/sachinlalmyes/");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.insta:
                 uri = Uri.parse("https://www.instagram.com/sachinlal_ms/");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.twt:
                uri = Uri.parse("https://twitter.com/sachinlalms95");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.gmil:
                uri = Uri.parse("https://www.linkedin.com/in/sachin-lal-m-s-5488821a7/");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.git:
                 uri = Uri.parse("https://github.com/sachinlalms/");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.web:
                 uri = Uri.parse("https://sachinlalms.github.io/sachinlalms/index.html");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;

        }

        }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}