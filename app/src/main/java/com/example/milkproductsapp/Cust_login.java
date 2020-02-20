package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cust_login extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_login);

        username=findViewById(R.id.uname);
        password=findViewById(R.id.pass);
        login=findViewById(R.id.login);

        myDb = new DatabaseHelper(this);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                if (username.getText().toString().length() == 0) {
                    Toast.makeText(Cust_login.this, "Enter Username", Toast.LENGTH_LONG).show();
                }
                else if (password.getText().toString().length() == 0) {
                    Toast.makeText(Cust_login.this, "Enter Password", Toast.LENGTH_LONG).show();
                }
                else {
                    String Username=username.getText().toString();
                    String Password=password.getText().toString();

                    String StoredPassword =myDb.getData(Username,Password);
                    if(Password.equals(StoredPassword))
                    {
                        Intent i=new Intent(Cust_login.this,Menu_activity.class);
                        Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_LONG).show();

                        i.putExtra("key", Username);
                        startActivity(i);
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Incorrect username or password", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
