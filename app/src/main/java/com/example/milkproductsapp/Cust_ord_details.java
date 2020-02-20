package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cust_ord_details extends AppCompatActivity {

    Button custdet,orddet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_ord_details);

        custdet=findViewById(R.id.cus);
        orddet=findViewById(R.id.ord);

        custdet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Cust_ord_details.this,Admin_cust_database.class);
                startActivity(i);
            }
        });

        orddet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(Cust_ord_details.this,Admin_order_database.class);
                startActivity(i);
            }
        });
    }
}
