package com.example.milkproductsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;


public class DatabaseHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "Milk_Product120.db";
    private static final String TABLE_NAME = "Customer_details";
    private static final String TABLE_NAME2 = "Order_details";
    private static final String COL_1 = "FIRSTNAME";
    private static final String COL_2 = "LASTNAME";
    private static final String COL_3 = "MOBILE_NO";
    private static final String COL_4 = "ADDRESS";
    private static final String COL_5 = "USERNAME";
    private static final String COL_6 = "PASSWORD";
    private static final String COL_11 = "USERNAME";
    private static final String COL_21 = "DATE";
    private static final String COL_31 = "BILL";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table if not exists "+TABLE_NAME+
                        "(FIRSTNAME TEXT,LASTNAME TEXT,MOBILE_NO INTEGER,ADDRESS TEXT,USERNAME TEXT,PASSWORD TEXT)"
        );

        db.execSQL(
                "create table if not exists "+TABLE_NAME2+
                        "(USERNAME TEXT,DATE TEXT,BILL INTEGER)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseHelper.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DatabaseHelper.TABLE_NAME2);
        onCreate(db);
    }

    public boolean insertData (String fname, String lname, String mono, String address, String username,String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_1, fname);
        contentValues.put(DatabaseHelper.COL_2, lname);
        contentValues.put(DatabaseHelper.COL_3, mono);
        contentValues.put(DatabaseHelper.COL_4, address);
        contentValues.put(DatabaseHelper.COL_5, username);
        contentValues.put(DatabaseHelper.COL_6, password);
        long newcustid=db.insert(TABLE_NAME, null, contentValues);
        if(newcustid==-1)
            return false;
        else
            return true;
    }

    public Cursor getAllData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("select * from "+DatabaseHelper.TABLE_NAME,null);
    }

    public String getData(String username,String pass)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from "+DatabaseHelper.TABLE_NAME+" where "+DatabaseHelper.COL_5+"=?", new String[]{username});
        if (cursor.getCount() > 0) {
            String user;
            cursor.moveToFirst();
            user = cursor.getString(5);
            cursor.close();
            return user;
        } else {
            return "FFFF";
        }
    }

    public boolean insertBill(String username,String date,String total)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_11, username);
        contentValues.put(DatabaseHelper.COL_21, date);
        contentValues.put(DatabaseHelper.COL_31, total);
        long newordid=db.insert(TABLE_NAME2, null, contentValues);
        if(newordid==-1)
            return false;
        else
            return true;
    }

    public Cursor getBill()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.rawQuery("select * from "+DatabaseHelper.TABLE_NAME2,null);
    }
}
