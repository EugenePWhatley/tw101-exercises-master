package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Eugene on 6/3/2015.
 */
public class Troll implements Monster {
    private String name = "Troll";
    private int hitPoints = 40;
    @Override
    public void takeDamage(int amount) {
        if(hitPoints>0){
            hitPoints-=amount/2;
        }
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
