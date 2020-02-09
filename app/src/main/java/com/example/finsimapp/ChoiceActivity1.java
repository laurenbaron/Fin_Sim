package com.example.finsimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChoiceActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Intent intent = new Intent(ChoiceActivity1.this, ChoiceActivity.class);
        int charSelect = intent.getIntExtra("charSelectNumber", 0);
        genStory(charSelect);
    }

    protected void genStory(final int charSelect) {

        TextView storyText = findViewById(R.id.storyText);
        Button choice0 = findViewById(R.id.choice0);
        Button choice1 = findViewById(R.id.choice1);
        Button choice2 = findViewById(R.id.choice2);

        if (charSelect==0) {
            storyText.setText(R.string.halle_story_1);
            choice0.setText(R.string.halle_choice_1_0);
            choice1.setText(R.string.halle_choice_1_1);
            choice2.setText(R.string.halle_choice_1_2);

        } else if (charSelect==1) {
            storyText.setText(R.string.jiamin_story_1);
            choice0.setText(R.string.jiamin_choice_1_0);
            choice1.setText(R.string.jiamin_choice_1_1);
            choice2.setText(R.string.jiamin_choice_1_2);
        } else if (charSelect==2) {
            storyText.setText(R.string.lauren_story_1);
            choice0.setText(R.string.lauren_choice_1_0);
            choice1.setText(R.string.lauren_choice_1_1);
            choice2.setText(R.string.lauren_choice_1_2);
        } else {
            storyText.setText(R.string.swetha_story_1);
            choice0.setText(R.string.swetha_choice_1_0);
            choice1.setText(R.string.swetha_choice_1_1);
            choice2.setText(R.string.swetha_choice_1_2);
        }
        Button button = findViewById(R.id.nextButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent intent = new Intent(ChoiceActivity1.this, ChoiceActivity2.class);
                intent.putExtra("charSelectNumber", charSelect);
                startActivity(intent);
            }
        });


    }
}
