package com.yg.darwinlabs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PinView extends AppCompatActivity implements View.OnClickListener {


    StringBuilder str;
    ImageView  enter, one, two, three, four;
    LinearLayout keycancel;
    TextView keyone, keytwo,keythree, keyfour, keyfive, keysix, keyseven, keyeight, keynine, keyzero, dot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_view);

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

        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);

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
    }

    @Override
    public void onClick(View view) {




        if (view == keycancel)
        {
            if (str.length() > 0) {
                str.setLength(str.length() - 1);
                System.out.println("Amitone " + str.length());
                System.out.println("Amit " + str.toString());

                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
//                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() == 2)
                {
//                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
//                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));

                }
                else if (str.length() == 3)
                {
//                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
//                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
//                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }

        if (view == enter)
        {
            if (str.length() == 4)
            {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            }
            else {

            }
        }

        if (view == keyone)
        {
//            Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
            if (str.length()<=3)
            {
                str.append("1");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
//                System.out.println("Amit " + str.toString());
//                System.out.println("Amit " + str.length());
            }

        }

        if (view == keytwo)
        {
            if (str.length()<=3)
            {
                str.append("2");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }


        if (view == keythree)
        {
            if (str.length()<=3)
            {
                str.append("3");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }


        if (view == keyfour)
        {
            if (str.length()<=3)
            {
                str.append("4");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }


        if (view == keyfive)
        {
            if (str.length()<=3)
            {
                str.append("5");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
//                System.out.println("Amitone " + str.length());
//                System.out.println("Amit " + str.toString());
            }
        }

        if (view == keysix)
        {
            if (str.length()<=3)
            {
                str.append("6");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }


        if (view == keyseven)
        {
            if (str.length()<=3)
            {
                str.append("7");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }

        if (view == keyeight)
        {
            if (str.length()<=3)
            {
                str.append("8");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }


        if (view == keynine)
        {
            if (str.length()<=3)
            {
                str.append("9");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }


        if (view == keyzero)
        {
            if (str.length()<=3)
            {
                str.append("0");
                if (str.length() ==0)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.unchecked));
                }
                else if (str.length() ==1)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 2)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));

                }
                else if (str.length() == 3)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else if (str.length() == 4)
                {
                    one.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    two.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    three.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                    four.setImageDrawable(getResources().getDrawable(R.drawable.checked));
                }
                else {

                }
            }
        }

        if (view == dot)
        {

        }

    }
}
