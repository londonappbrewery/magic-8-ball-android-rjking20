package com.rjfication.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button aSk=findViewById(R.id.ask);
        final ImageView Magic=findViewById(R.id.magic);

        //-----------Using Array for storing all images

        final int [] ball={R.drawable.good,
                     R.drawable.nah,
                     R.drawable.yeah,
                     R.drawable.go
        };





        aSk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //-----------Using Random class for pick images randomly

                Random random=new Random();

                final int position=random.nextInt(4);

                Magic.setImageResource(ball[position]);
            }
        });
    }
}
