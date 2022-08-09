package com.company;

public class Duck extends Pet implements PetInterface{
    private boolean alive = true;
    @Override
    public void feed(int food) {
        this.setThummyStatus(this.getThummyStatus() + food);
        System.out.println("Now, duck thummy is in " + getThummyStatus() + "% full");
        if(this.getThummyStatus()>100) System.out.println("Be careful! 150% means that dog will explode!");
    }

    @Override
    public String pet() {
        return "quack quack!";
    }

    @Override
    public void starve() {
        setDaysOfStarving(this.getDaysOfStarving()-1);
        if(this.getDaysOfStarving()==3) alive = false;
    }
}
