package com.example.milkproductsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu_activity extends AppCompatActivity
{
    DatabaseHelper myDb;
    Button p1,p2,p3,p4,p5,p6;
    Button n1,n2,n3,n4,n5,n6;
    EditText orderdate;
    TextView tt1,tt2,tt3,tt4,tt5,tt6;

    int qtt1,qtt2,qtt3,qtt4,qtt5,qtt6;

    Button im1,im2,im3,im4,im5,im6;

    Button buy;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_activity);

        p1=findViewById(R.id.poe1);
        p2=findViewById(R.id.poe2);
        p3=findViewById(R.id.poe3);
        p4=findViewById(R.id.poe4);
        p5=findViewById(R.id.poe5);
        p6=findViewById(R.id.poe6);

        n1=findViewById(R.id.neg1);
        n2=findViewById(R.id.neg2);
        n3=findViewById(R.id.neg3);
        n4=findViewById(R.id.neg4);
        n5=findViewById(R.id.neg5);
        n6=findViewById(R.id.neg6);

        tt1=findViewById(R.id.qty1);
        tt2=findViewById(R.id.qty2);
        tt3=findViewById(R.id.qty3);
        tt4=findViewById(R.id.qty4);
        tt5=findViewById(R.id.qty5);
        tt6=findViewById(R.id.qty6);

        buy=findViewById(R.id.buy);

        im1=findViewById(R.id.info1);
        im2=findViewById(R.id.info2);
        im3=findViewById(R.id.info3);
        im4=findViewById(R.id.info4);
        im5=findViewById(R.id.info5);
        im6=findViewById(R.id.info6);

        orderdate=findViewById(R.id.orddate);

        myDb = new DatabaseHelper(this);


        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {

                AlertDialog.Builder builder = new AlertDialog.Builder(Menu_activity.this);

                // Set the message show for the Alert time
                builder.setMessage("Frezmoo milk 1L cost ₹ 50  best before 3 days from packing ");

                // Set Alert Title
                builder.setTitle("Information !");

                builder.setCancelable(false);

                builder.setNegativeButton("BACK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                        // If user click no
                        // then dialog box is canceled.
                        dialog.cancel();
                    }
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();

                // Show the Alert Dialog box
                alertDialog.show();
            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(Menu_activity.this);

                // Set the message show for the Alert time
                builder.setMessage("Frezmoo Dahi 200gm cost ₹ 40  best before 3 days from packing ");

                // Set Alert Title
                builder.setTitle("Information !");

                builder.setCancelable(false);

                builder.setNegativeButton("BACK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // If user click no
                        // then dialog box is canceled.
                        dialog.cancel();
                    }
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();

                // Show the Alert Dialog box
                alertDialog.show();
            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(Menu_activity.this);

                // Set the message show for the Alert time
                builder.setMessage("Frezmoo Paneer 250gm cost ₹ 90  best before 2 days from packing ");

                // Set Alert Title
                builder.setTitle("Information !");


                builder.setCancelable(false);

                builder
                        .setNegativeButton(
                                "BACK",
                                new DialogInterface
                                        .OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which)
                                    {

                                        // If user click no
                                        // then dialog box is canceled.
                                        dialog.cancel();
                                    }
                                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();

                // Show the Alert Dialog box
                alertDialog.show();
            }
        });

        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(Menu_activity.this);

                // Set the message show for the Alert time
                builder.setMessage("Frezmoo Ghee 500ml cost ₹ 300  best before 6 months from packing ");

                // Set Alert Title
                builder.setTitle("Information !");

                builder.setCancelable(false);

                builder.setNegativeButton("BACK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // If user click no
                        // then dialog box is canceled.
                        dialog.cancel();
                    }
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();

                // Show the Alert Dialog box
                alertDialog.show();
            }
        });

        im5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(Menu_activity.this);

                // Set the message show for the Alert time
                builder.setMessage("Frezmoo Butter 500gm cost ₹ 250  best before 2 months from packing ");

                // Set Alert Title
                builder.setTitle("Information !");

                builder.setCancelable(false);

                builder.setNegativeButton("BACK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // If user click no
                        // then dialog box is canceled.
                        dialog.cancel();
                    }
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();

                // Show the Alert Dialog box
                alertDialog.show();
            }
        });

        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0)
            {
                AlertDialog.Builder builder = new AlertDialog.Builder(Menu_activity.this);

                // Set the message show for the Alert time
                builder.setMessage("Frezmoo Cheese 1kg cost ₹ 400  best before 1 month from packing ");

                // Set Alert Title
                builder.setTitle("Information !");

                builder.setCancelable(false);

                builder.setNegativeButton("BACK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // If user click no
                        // then dialog box is canceled.
                        dialog.cancel();
                    }
                });

                // Create the Alert dialog
                AlertDialog alertDialog = builder.create();

                // Show the Alert Dialog box
                alertDialog.show();
            }
        });

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                qtt1 = qtt1 + 1;

                if(qtt1>10)
                {
                    qtt1=9;
                }
                display1(qtt1);
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt1 = qtt1 - 1;
                if (qtt1 <= -1) {
                    qtt1 = 0;
                }
                display1(qtt1);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt2 = qtt2 + 1;

                if(qtt2 > 10)
                {
                    qtt2=9;
                }
                display2(qtt2);
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt2 = qtt2 - 1;
                if (qtt2 <= -1) {
                    qtt2 = 0;
                }
                display2(qtt2);
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt3 = qtt3 + 1;

                if(qtt3 > 10)
                {
                    qtt3=9;
                }
                display3(qtt3);
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt3 = qtt3 - 1;
                if (qtt3 <= -1) {
                    qtt3 = 0;
                }
                display3(qtt3);
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt4 = qtt4 + 1;

                if(qtt4 > 10)
                {
                    qtt4=9;
                }
                display4(qtt4);
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt4 = qtt4 - 1;
                if (qtt4 <= -1) {
                    qtt4 = 0;
                }
                display4(qtt4);
            }
        });

        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt5 = qtt5 + 1;

                if(qtt5 > 10)
                {
                    qtt5=9;
                }
                display5(qtt5);
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt5 = qtt5 - 1;
                if (qtt5 <= -1) {
                    qtt5 = 0;
                }
                display5(qtt5);
            }
        });

        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt6 = qtt6 + 1;

                if(qtt6 > 10)
                {
                    qtt6=9;
                }
                display6(qtt6);
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                qtt6 = qtt6 - 1;
                if (qtt6 <= -1) {
                    qtt6 = 0;
                }
                display6(qtt6);
            }
        });

        buy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                String num;

                if(orderdate.getText().toString().length()==0)
                {
                    Toast.makeText(Menu_activity.this, "Enter order date", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent int1 = new Intent(Menu_activity.this, bill.class);

                    int total_milk = qtt1 * 50;
                    num = Float.toString(total_milk);
                    int1.putExtra("key_1", num);

                    int total_dahi = qtt2 * 40;
                    num = Float.toString(total_dahi);
                    int1.putExtra("key_2", num);

                    int total_panner = qtt3 * 90;
                    num = Float.toString(total_panner);
                    int1.putExtra("key_3", num);

                    int total_ghee = qtt4 * 300;
                    num = Float.toString(total_ghee);
                    int1.putExtra("key_4", num);

                    int total_butter = qtt5 * 250;
                    num = Float.toString(total_butter);
                    int1.putExtra("key_5", num);

                    int total_cheese = qtt6 * 400;
                    num = Float.toString(total_cheese);
                    int1.putExtra("key_6", num);

                    int total = total_milk + total_dahi + total_panner + total_ghee + total_butter + total_cheese;
                    num = Float.toString(total);
                    int1.putExtra("key_7", num);

                    String date=orderdate.getText().toString();
                    int1.putExtra("key_8", date);

                    AddData(num,date);

                    startActivity(int1);
                }
            }
        });
    }
    public void AddData(String total,String date)
    {
        Bundle bundle1 = getIntent().getExtras();
        String Username=(String)bundle1.get("key");

        boolean isInserted = myDb.insertBill(Username,date,total);

        if (isInserted==true)
            Toast.makeText(Menu_activity.this, "Order Stored", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(Menu_activity.this, "Order not Stored", Toast.LENGTH_LONG).show();
    }

    private void display1 ( int number)
    {
        TextView t1 = (TextView) findViewById(R.id.qty1);
        t1.setText("" + number);
    }
    private void display2 ( int number)
    {
        TextView t2 = (TextView) findViewById(R.id.qty2);
        t2.setText("" + number);
    }
    private void display3 ( int number)
    {
        TextView t3 = (TextView) findViewById(R.id.qty3);
        t3.setText("" + number);
    }
    private void display4 ( int number)
    {
        TextView t4 = (TextView) findViewById(R.id.qty4);
        t4.setText("" + number);
    }
    private void display5 ( int number)
    {
        TextView t5 = (TextView) findViewById(R.id.qty5);
        t5.setText("" + number);
    }
    private void display6 ( int number)
    {
        TextView t6 = (TextView) findViewById(R.id.qty6);
        t6.setText("" + number);
    }
}
