package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ad_Cus_Log extends AppCompatActivity {

    Button admin;
    Button customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad__cus__log);

        admin=findViewById(R.id.cus);
        customer=findViewById(R.id.customer);

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Ad_Cus_Log.this,admin_login.class);
                startActivity(i);
            }
        });

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Ad_Cus_Log.this,Cust_login_signup.class);
                startActivity(i);
            }
        });

    }
}
