package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Eugene on 6/3/2015.
 */
public class Orc implements Monster{
    private String name = "Orc";
    private int hitPoints = 20;

    @Override
    public void takeDamage(int amount) {
        if(hitPoints > 0) hitPoints-=amount;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int currentHitPoints() {
        return hitPoints;
    }
}
