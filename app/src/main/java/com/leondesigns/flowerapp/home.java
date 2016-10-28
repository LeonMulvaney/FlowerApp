package com.leondesigns.flowerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void viewCatalogue(View view){
        Intent viewCatalogue = new Intent(this,catalogue.class);
        startActivity(viewCatalogue);
    }

    public void viewFloristsAZ (View view) {
        Intent viewFloristsAZ = new Intent(this, floristsaz.class);
        startActivity(viewFloristsAZ);
    }

    public void viewFlowerArchive (View view) {
        Intent viewFlowerArchive = new Intent(this, flowerArchive.class);
        startActivity(viewFlowerArchive);
    }
}
