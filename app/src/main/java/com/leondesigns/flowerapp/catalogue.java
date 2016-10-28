package com.leondesigns.flowerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class catalogue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogue);

        String[] cat = {"Old Rose", "Red Rose","Lucky Star","Allure", "Old Rose", "Red Rose","Lucky Star","Allure", "Old Rose", "Red Rose","Lucky Star","Allure"};

        ListAdapter listAdapter = new customAdapter(this, cat);

        ListView CatalogueListView = (ListView)findViewById(R.id.CatalogueListView);
        CatalogueListView.setAdapter(listAdapter);

        CatalogueListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> perant, View view, int position, long id) {
                        String cat = String.valueOf(perant.getItemAtPosition(position));
                        Toast.makeText(catalogue.this, cat, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewHome(View view){
        Intent viewHome = new Intent(this,home.class);
        startActivity(viewHome);
    }





}
