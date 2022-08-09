package com.company;

public abstract class Pet {
    private int thummyStatus;
    private String sound;
    private int daysOfStarving;

    public Pet(){
        this.thummyStatus = 100;
    };

    public int getThummyStatus() {
        return thummyStatus;
    }

    public String getSound() {
        return sound;
    }

    public void setThummyStatus(int thummyStatus) {
        this.thummyStatus = thummyStatus;
    }

    public int getDaysOfStarving() {
        return daysOfStarving;
    }

    public void setDaysOfStarving(int daysOfStarving) {
        this.daysOfStarving = daysOfStarving;
    }
}
