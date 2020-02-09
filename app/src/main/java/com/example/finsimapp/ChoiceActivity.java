package com.example.finsimapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ChoiceActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Intent intent = new Intent(ChoiceActivity.this, characterGenActivity.class);
        int charSelect = intent.getIntExtra("charSelectNumber", 0);
        genStory(charSelect);
    }

    protected void genStory(final int charSelect) {

        TextView storyText = findViewById(R.id.storyText);
        Button choice0 = findViewById(R.id.choice0);
        Button choice1 = findViewById(R.id.choice1);
        Button choice2 = findViewById(R.id.choice2);

        if (charSelect == 0) {
            storyText.setText(R.string.halle_story_0);
            choice0.setText(R.string.halle_choice_0_0);
            choice1.setText(R.string.halle_choice_0_1);
            choice2.setText(R.string.halle_choice_0_2);

        } else if (charSelect == 1) {
            storyText.setText(R.string.jiamin_story_0);
            choice0.setText(R.string.jiamin_choice_0_0);
            choice1.setText(R.string.jiamin_choice_0_1);
            choice2.setText(R.string.jiamin_choice_0_2);
        } else if (charSelect == 2) {
            storyText.setText(R.string.lauren_story_0);
            choice0.setText(R.string.lauren_choice_0_0);
            choice1.setText(R.string.lauren_choice_0_1);
            choice2.setText(R.string.lauren_choice_0_2);
        } else {
            storyText.setText(R.string.swetha_story_0);
            choice0.setText(R.string.swetha_choice_0_0);
            choice1.setText(R.string.swetha_choice_0_1);
            choice2.setText(R.string.swetha_choice_0_2);

        }
        RadioGroup choiceGroup = findViewById(R.id.choiceGroup);
        Button button = findViewById(R.id.nextButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent intent = new Intent(ChoiceActivity.this, ChoiceActivity1.class);
                intent.putExtra("charSelectNumber", charSelect);
                startActivity(intent);
            }
        });


    }

}

