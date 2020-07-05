package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final Random RANDOM = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageDice = findViewById(R.id.imageDice);
        Button buttonRoll = findViewById(R.id.buttonRoll);

        buttonRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageDice.setImageResource(getResources().getIdentifier("dice_"+rollingIt(), "drawable", "com.example.diceroller"));
            }
        });

    }

    public static int rollingIt(){
        return RANDOM.nextInt(6)+1;
    }
}
