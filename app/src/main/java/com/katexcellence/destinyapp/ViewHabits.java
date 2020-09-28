package com.katexcellence.destinyapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewHabits extends AppCompatActivity {

    ArrayList<Habit> habits;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_habits);

        /*
            Binding the Adapter to the RecyclerView
         */

        // Get the RecyclerView
        RecyclerView rvHabits = (RecyclerView) findViewById(R.id.rvHabits);

        // Initialize habits
        habits.add(new Habit("Wash dishes"));
        habits.add(new Habit("Walk dog"));
        habits.add(new Habit("Call mom"));

        // Pass habits to the adapter
        HabitAdapter adapter = new HabitAdapter(habits);

        // Attach adapter to recycler view
        rvHabits.setAdapter(adapter);

        // Set the layout manager
        rvHabits.setLayoutManager(new LinearLayoutManager(this));
    }
}
