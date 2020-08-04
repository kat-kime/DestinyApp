package com.katexcellence.destinyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Declaring instance variables
    Button updateButton;
    EditText scoreCount;
    EditText completeCount;
    EditText incompleteCount;
    List<String> habits;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assigning variables to items
        updateButton = findViewById(R.id.mainUpdateButton);
        scoreCount = findViewById(R.id.mainScoreCount);
        completeCount = findViewById(R.id.mainCompleteCount);
        incompleteCount = findViewById(R.id.mainIncompleteCount);

        // Adding listener to update button
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_update);
            }
        });

    }
}