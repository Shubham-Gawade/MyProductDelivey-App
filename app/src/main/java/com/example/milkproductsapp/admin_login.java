package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admin_login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        username=findViewById(R.id.uname);
        password=findViewById(R.id.pass);
        login=findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(username.getText().toString().length()==0)
                {
                    Toast.makeText(admin_login.this,"Enter Username",Toast.LENGTH_LONG).show();
                }
                else if(password.getText().toString().length()==0)
                {
                    Toast.makeText(admin_login.this,"Enter Password",Toast.LENGTH_LONG).show();
                }
                else if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Intent i=new Intent(admin_login.this,Cust_ord_details.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(admin_login.this, "Incorrect Username and Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
