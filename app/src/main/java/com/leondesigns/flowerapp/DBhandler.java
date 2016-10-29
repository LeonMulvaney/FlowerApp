package com.leondesigns.flowerapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Kaos117 on 28/10/2016.
 */

public class DBhandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "floristAppDB.db";
    private static final String TABLE_PRODUCTS = "userRegisterInfo";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_PHONENUM = "phoneNum";
    private static final String COLUMN_ADDRESS = "address";

    public DBhandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE" + TABLE_PRODUCTS + "(" +
                COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT" +
                COLUMN_EMAIL + "TEXT" +
                COLUMN_NAME + "TEXT" +
                COLUMN_PHONENUM + "INTEGER" +
                COLUMN_ADDRESS + "TEXT" +
                ");";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS" + TABLE_PRODUCTS);
        onCreate(db);
    }


    //add new row
    public void addUser(RegisterUser registeruser){

        ContentValues values = new ContentValues();
        values.put(COLUMN_EMAIL, registeruser.get_email());
        values.put(COLUMN_NAME, registeruser.get_name());
        values.put(COLUMN_PHONENUM, registeruser.get_phoneNum());
        values.put(COLUMN_ADDRESS, registeruser.get_address());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_PRODUCTS, null, values);

        db.close();
    }

    //print database
    public void dbToString(){
        String dbString;

        SQLiteDatabase db = getWritableDatabase();

        String query = "SELECT * FROM" + TABLE_PRODUCTS + "WHERE 1";

        //curser point to location in results
        //Curser c = db.rawQuery(query, null);
        //c.moveToFirst();

        db.close();

    }



}
