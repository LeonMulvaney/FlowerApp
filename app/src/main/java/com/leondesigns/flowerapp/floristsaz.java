package com.leondesigns.flowerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class floristsaz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floristsaz);
    }

    public void viewHome(View view){
        Intent viewHome = new Intent(this,MainActivity.class);
        startActivity(viewHome);
    }

}
