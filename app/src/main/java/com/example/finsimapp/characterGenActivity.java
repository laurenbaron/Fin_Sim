package com.example.finsimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class characterGenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_gen);

        Random r = new Random();
        final int charSelect = r.nextInt(4);

        genIntroText(charSelect);

        Button button = findViewById(R.id.nextButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent intent = new Intent(characterGenActivity.this, ChoiceActivity.class);
                intent.putExtra("charSelectNumber", charSelect);
                int storyProgress = 0;
                intent.putExtra("storyProgress", storyProgress);
                startActivity(intent);
           }
        });
    }

    protected void genIntroText(int i) {
        //System.out.println("i equals = " + i);
        TextView charIntroText = findViewById(R.id.storyText);
        TextView charIntroName = findViewById(R.id.characterIntroName);
        if (i==0) {
            charIntroName.setText(R.string.halle_intro);
            charIntroText.setText(R.string.halle_bio);
        } else if (i==1) {
            charIntroName.setText(R.string.jiamin_intro);
            charIntroText.setText(R.string.jiamin_bio);
        } else if (i==2) {
            charIntroName.setText(R.string.lauren_intro);
            charIntroText.setText(R.string.lauren_bio);
        } else {
            charIntroName.setText(R.string.swetha_intro);
            charIntroText.setText(R.string.swetha_bio);
        }

    }
}
