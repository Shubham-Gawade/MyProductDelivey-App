package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class bill extends AppCompatActivity {

    TextView total_milk;
    TextView total_dahi;
    TextView total_panner;
    TextView total_ghee;
    TextView total_butter;
    TextView total_cheese;
    TextView total;
    TextView order_date;

    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        total_milk=findViewById(R.id.milk);
        total_dahi=findViewById(R.id.dahi);
        total_panner=findViewById(R.id.panner);
        total_ghee=findViewById(R.id.ghee);
        total_butter=findViewById(R.id.butter);
        total_cheese=findViewById(R.id.cheese);
        total=findViewById(R.id.total_bill);
        back=findViewById(R.id.back);
        order_date=findViewById(R.id.date);

        String res;

        Bundle bundle1 = getIntent().getExtras();

        res=(String)bundle1.get("key_1");
        total_milk.setText(res);

        res=(String)bundle1.get("key_2");
        total_dahi.setText(res);

        res=(String)bundle1.get("key_3");
        total_panner.setText(res);

        res=(String)bundle1.get("key_4");
        total_ghee.setText(res);

        res=(String)bundle1.get("key_5");
        total_butter.setText(res);

        res=(String)bundle1.get("key_6");
        total_cheese.setText(res);

        res=(String)bundle1.get("key_7");
        total.setText(res);

        res=(String)bundle1.get("key_8");
        order_date.setText(res);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11=new Intent(bill.this,Ad_Cus_Log.class);
                startActivity(int11);
            }
        });
    }
}
