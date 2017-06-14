package com.example.erzse.pieceofcake;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }
    public void nohe (View view){
        Intent noheIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nrparrado"));
        startActivity(noheIntent);
    }

    public void gdg (View view){
        Intent gdgIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/GDGAndroidBolivia/"));
        startActivity(gdgIntent);
    }
}
