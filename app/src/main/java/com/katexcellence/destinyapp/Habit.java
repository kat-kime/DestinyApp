package com.katexcellence.destinyapp;

public class Habit {
    // Declaring instance variables
    String habit;
    Boolean complete;

    public Habit(String userText) {
        this.habit = userText;
        this.complete = false;
    }

    public String getHabit() {
        return habit;
    }

    public boolean getComplete() {
        return complete;
    }
}
