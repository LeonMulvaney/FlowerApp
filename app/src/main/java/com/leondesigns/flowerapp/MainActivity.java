package com.leondesigns.flowerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText emailInput;
    EditText nameInput;
    EditText phoneInput;
    EditText addressInput;

    DBhandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailInput = (EditText) findViewById(R.id.emailInput);
        nameInput = (EditText) findViewById(R.id.nameInput);
        phoneInput = (EditText) findViewById(R.id.phoneInput);
        addressInput = (EditText) findViewById(R.id.addressInput);

        dbHandler = new DBhandler(this, null, null, 1);
    }
    //add stuff to db
    public void registerButtonClicked(){
        RegisterUser registeruser = new RegisterUser(emailInput.getText().toString(), nameInput.getText().toString(), phoneInput.getText().toString(), addressInput.getText().toString());
        dbHandler.addUser(registeruser);
    }




//login button goes to homepage though
    public void viewHome(View view){
        Intent viewHome = new Intent(this,home.class);
        startActivity(viewHome);
    }

    public void viewRegisterUser(View view){
        Intent viewRegisterUser = new Intent(this, RegisterUser.class);
        startActivity(viewRegisterUser);
    }


}

