package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cust_signup extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText fname;
    EditText lname;
    EditText Mono;
    EditText address;
    EditText username;
    EditText pass;
    Button sigup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_signup);

        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        Mono = (EditText) findViewById(R.id.MoNo);
        address = (EditText) findViewById(R.id.address);
        username = (EditText) findViewById(R.id.uname);
        pass = (EditText) findViewById(R.id.pass);
        sigup = (Button) findViewById(R.id.submit);

        myDb = new DatabaseHelper(this);

        sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String MobilePattern = "[0-9]{10}";

                if (fname.getText().toString().length() == 0) {
                    Toast.makeText(Cust_signup.this, "Enter First name", Toast.LENGTH_LONG).show();
                } else if (lname.getText().toString().length() == 0) {
                    Toast.makeText(Cust_signup.this, "Enter Last name", Toast.LENGTH_LONG).show();
                } else if (!Mono.getText().toString().matches(MobilePattern)) {
                    Toast.makeText(Cust_signup.this, "Enter 10 digit Mobile number", Toast.LENGTH_LONG).show();
                } else if (address.getText().toString().length() == 0) {
                    Toast.makeText(Cust_signup.this, "Enter Adresss", Toast.LENGTH_LONG).show();
                } else if (username.getText().toString().length() == 0) {
                    Toast.makeText(Cust_signup.this, "Enter Username", Toast.LENGTH_LONG).show();
                } else if (pass.getText().toString().length() == 0) {
                    Toast.makeText(Cust_signup.this, "Enter Password", Toast.LENGTH_LONG).show();
                } else {

                    Intent i = new Intent(Cust_signup.this, Menu_activity.class);

                    AddData();

                    i.putExtra("key", username.getText().toString());
                    startActivity(i);
                }
            }
        });
        }

        public void AddData ()
        {
            boolean isInserted = myDb.insertData(fname.getText().toString(),
                    lname.getText().toString(),
                    Mono.getText().toString(),
                    address.getText().toString(),
                    username.getText().toString(),
                    pass.getText().toString());

            if (isInserted==true)
                Toast.makeText(Cust_signup.this, "Data Inserted", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(Cust_signup.this, "Data not Inserted", Toast.LENGTH_LONG).show();
        }
}
