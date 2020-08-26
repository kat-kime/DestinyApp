package com.katexcellence.destinyapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class UpdateActivity extends AppCompatActivity {
    // Declaring instance variables
    RecyclerView habitList;
    Button newHabitButton;
    EditText newHabitText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        // Assigning variables to items
        habitList = findViewById(R.id.habitList);
        newHabitButton = findViewById(R.id.newHabitButton);
        newHabitText = findViewById(R.id.newHabitText);

    }
}
