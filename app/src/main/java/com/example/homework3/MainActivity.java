package com.example.homework3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView tR,tG,tB,txv;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tR = findViewById(R.id.textView1);
        tG = findViewById(R.id.textView2);
        tB = findViewById(R.id.textView3);
        txv = findViewById(R.id.textView6);


        Button submit = (Button)findViewById(R.id.button);
        submit.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Random x= new Random();

                int red =x.nextInt(256);
                tR.setText("Red "+ red);
                tR.setTextColor(Color.rgb(red,0,0));

                int green =x.nextInt(256);
                tG.setText("Green "+ green);
                tG.setTextColor(Color.rgb(0,green,0));

                int blue =x.nextInt(256);
                tB.setText("Blue "+ blue);
                tB.setTextColor(Color.rgb(0,0,blue));

                text += red +", "+ green + ", "+ blue +"\n";
                txv.setTextSize(20);
                txv.setText(text);
                txv.setMovementMethod(new ScrollingMovementMethod());
                txv.setBackgroundColor(Color.rgb(red,green,blue));






            }

        });



    }
}
