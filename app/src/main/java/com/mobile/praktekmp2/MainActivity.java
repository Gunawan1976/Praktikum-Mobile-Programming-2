package com.mobile.praktekmp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mobile.praktekmp2.Roomdata.RoomData;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 =  findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
    }
    @Override
    protected void onResume(){
        super.onResume();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a = new Intent(getApplicationContext(),received.class);
                a.putExtra("praktek", " hallo lur ");
                startActivity(a);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(getApplicationContext(),activitywithfragment.class);
                startActivity(b);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(getApplicationContext(),sharedprefence.class);
                startActivity(c);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(getApplicationContext(), RoomData.class);
                startActivity(d);
            }
        });

    }
}
