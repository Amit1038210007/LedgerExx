package com.yg.darwinlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Send extends AppCompatActivity implements View.OnClickListener{

    StringBuilder str;
    ImageView enter;
    LinearLayout keycancel;
    TextView keyone, keytwo,keythree, keyfour, keyfive, keysix, keyseven, keyeight, keynine, keyzero, dot;
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        initview();
        str = new StringBuilder();

        keycancel.setOnClickListener(this);
        enter.setOnClickListener(this);
        dot.setOnClickListener(this);
        keyzero.setOnClickListener(this);
        keyone.setOnClickListener(this);
        keytwo.setOnClickListener(this);
        keythree.setOnClickListener(this);
        keyfour.setOnClickListener(this);
        keyfive.setOnClickListener(this);
        keysix.setOnClickListener(this);
        keyseven.setOnClickListener(this);
        keyeight.setOnClickListener(this);
        keynine.setOnClickListener(this);
    }

    public void initview()
    {
        keycancel = (LinearLayout) findViewById(R.id.keycancel);
        enter = (ImageView) findViewById(R.id.enter);

        keyone = (TextView) findViewById(R.id.keyone);
        keytwo = (TextView) findViewById(R.id.keytwo);
        keythree = (TextView) findViewById(R.id.keythree);
        keyfour = (TextView) findViewById(R.id.keyfour);
        keyfive = (TextView) findViewById(R.id.keyfive);
        keysix = (TextView) findViewById(R.id.keysix);
        keyseven = (TextView) findViewById(R.id.keyseven);
        keyeight = (TextView) findViewById(R.id.keyeight);
        keynine = (TextView) findViewById(R.id.keynine);
        keyzero = (TextView) findViewById(R.id.keyzero);
        dot = (TextView) findViewById(R.id.dot);
        edittext = (EditText) findViewById(R.id.edittext);
    }
    @Override
    public void onClick(View view) {


        if (view == keycancel) {
            if (str.length() > 0) {
                str.setLength(str.length() - 1);
                System.out.println("Amitone " + str.length());
                System.out.println("Amit " + str.toString());
                edittext.setText(str.toString());

            }
        }

        if (view == enter) {
//            if (str.length() == 4) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
//            } else {
//
//            }
        }

        if (view == keyone) {
//            Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
            if (str.length() <= 3) {
                str.append("1");
                edittext.setText(str.toString());

//                System.out.println("Amit " + str.toString());
//                System.out.println("Amit " + str.length());
            }

        }

        if (view == keytwo) {
            if (str.length() <= 3) {
                str.append("2");
                edittext.setText(str.toString());
            }
        }


        if (view == keythree) {
            if (str.length() <= 3) {
                str.append("3");
                edittext.setText(str.toString());
            }
        }


        if (view == keyfour) {
            if (str.length() <= 3) {
                str.append("4");
                edittext.setText(str.toString());
            }
        }


        if (view == keyfive) {
            if (str.length() <= 3) {
                str.append("5");
                edittext.setText(str.toString());
//                System.out.println("Amitone " + str.length());
//                System.out.println("Amit " + str.toString());
            }
        }

        if (view == keysix) {
            if (str.length() <= 3) {
                str.append("6");
                edittext.setText(str.toString());
            }
        }


        if (view == keyseven) {
            if (str.length() <= 3) {
                str.append("7");
                edittext.setText(str.toString());
            }
        }

        if (view == keyeight) {
            if (str.length() <= 3) {
                str.append("8");
                edittext.setText(str.toString());
            }
        }


        if (view == keynine) {
            if (str.length() <= 3) {
                str.append("9");
                edittext.setText(str.toString());
            }
        }


        if (view == keyzero) {
            if (str.length() <= 3) {
                str.append("0");
                edittext.setText(str.toString());
            }
        }

        if (view == dot) {

        }
    }



    }
