package com.example.marymathauser.qpapper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import com.example.marymathauser.R;
import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class

PdfViewActivity extends AppCompatActivity {
    private String url;
    private PDFView pdfViewr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);
        url = getIntent().getStringExtra("QuestionUrl");
        pdfViewr = findViewById(R.id.pdfViewr);
        new pdfDownload().execute(url);

    }

    private class pdfDownload extends AsyncTask<String, Void, InputStream> {

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL url = new URL(strings[0]);

                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                if (urlConnection.getResponseCode() == 200) {
                    inputStream = new BufferedInputStream(urlConnection.getInputStream());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            return inputStream;
        }


        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfViewr.fromStream(inputStream).load();

        }
    }
}