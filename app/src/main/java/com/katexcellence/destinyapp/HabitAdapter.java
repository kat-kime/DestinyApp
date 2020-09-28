package com.katexcellence.destinyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HabitAdapter extends RecyclerView.Adapter<HabitAdapter.ViewHolder>{

    // Creating the list of habits
    private List<Habit> mHabits;

    public HabitAdapter(List<Habit> habits) {
        mHabits = habits;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the layout
        View habitView = inflater.inflate(R.layout.item_habit, parent, false);

        // Return an instance of a holder
        ViewHolder viewHolder = new ViewHolder(habitView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HabitAdapter.ViewHolder holder, int position) {
        // Grab the data based on the position
        Habit habit = mHabits.get(position);

        // Populate the item's views from the data
        TextView textView = holder.tvHabit;
        textView.setText(habit.getHabit());

    }

    @Override
    public int getItemCount() {
        return mHabits.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvHabit;

        public ViewHolder(View itemView) {
            super(itemView);

            tvHabit = (TextView) itemView.findViewById(R.id.tvHabit);
        }
    }


}
