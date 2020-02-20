package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListView;


public class Admin_cust_database extends AppCompatActivity {

    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_cust_database);

        myDb = new DatabaseHelper(this);

        viewall();
    }

    public void viewall()
    {
        StringBuilder buffer = new StringBuilder();
        Cursor res = myDb.getAllData();
        if (res.getCount() == 0)
        {
            showMessage("Error", "Nothing found");
            return;
        }
        else
        {
            while (res.moveToNext())
            {
                buffer.append("FIRSTNAME  :" + res.getString(0) + "\n");
                buffer.append("LASTNAME   :" + res.getString(1) + "\n");
                buffer.append("MOBILE NO  :" + res.getString(2) + "\n");
                buffer.append("ADDRESS    :" + res.getString(3) + "\n");
                buffer.append("USERNAME   :" + res.getString(4) + "\n");
                buffer.append("PASSWORD   :" + res.getString(5) + "\n");
                buffer.append("------------------------------------------------------\n");
            }
        }
        showMessage("Customer Details Database :", buffer.toString());
    }
    public void showMessage(String title, String Message)
    {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setCancelable(true);
            builder.setTitle(title);
            builder.setMessage(Message);
            builder.show();
    }
}
