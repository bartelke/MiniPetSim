package com.company;

public class Cat extends Pet implements PetInterface{
    private boolean alive=true;

    @Override
    public void feed(int food) {
        this.setThummyStatus(this.getThummyStatus() + food);
        System.out.println("Now, cat thummy is in " + getThummyStatus() + "% full");
        if(this.getThummyStatus()>100) System.out.println("Be careful! 150% means that dog will explode!");
        if(this.getThummyStatus()>=150){
            System.out.println("Duck exploded! You've overfed it!");
            alive = false;
        }
        setDaysOfStarving(0);
    }

    @Override
    public String pet() {
        return "meow meow!";
    }

    @Override
    public void starve() {
        setDaysOfStarving(this.getDaysOfStarving()+1);
        if(this.getDaysOfStarving()==4) alive = false;
        setThummyStatus(getThummyStatus()-20);
        if(this.getThummyStatus()<=0) alive = false;
    }
    public void statistics(){
        System.out.println("Cat is in " + getThummyStatus() + "% fed");
    }
    public boolean getAlive(){
        return this.alive;
    }
}
