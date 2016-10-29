package com.leondesigns.flowerapp;

/**
 * Created by Kaos117 on 28/10/2016.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterUser {


    //var we will use
    private int _id;
    private String _name;
    private String _email;
    private String _phoneNum;
    private String _address;

    public RegisterUser(){

    }
    //constructor for instances
    public RegisterUser(String name, String email, String phoneNum, String address) {
        this._email = email;
        this._name = name;
        this._phoneNum = phoneNum;
        this._address = address;
    }

    //setters
    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public void set_phoneNum(String _phoneNum) {
        this._phoneNum = _phoneNum;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    //getters
    public int get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public String get_email() {
        return _email;
    }

    public String get_phoneNum() {
        return _phoneNum;
    }

    public String get_address() {
        return _address;
    }
}

