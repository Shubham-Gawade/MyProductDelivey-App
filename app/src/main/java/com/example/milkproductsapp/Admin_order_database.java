package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;

public class Admin_order_database extends AppCompatActivity {

    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_order_database);

        myDb = new DatabaseHelper(this);

        viewall();
    }

    public void viewall()
    {
        StringBuilder buffer = new StringBuilder();
        Cursor res = myDb.getBill();
        if (res.getCount() == 0)
        {
            showMessage("Error", "Nothing found");
            return;
        }
        else
        {
            while (res.moveToNext())
            {
                buffer.append("USERNAME    :" + res.getString(0) + "\n");
                buffer.append("ORDER DATE  :" + res.getString(1) + "\n");
                buffer.append("TOTAL BILL  :" + res.getString(2) + "\n");
                buffer.append("----------------------------------------------------\n");
            }
        }
        showMessage("Order Details Database :", buffer.toString());
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
