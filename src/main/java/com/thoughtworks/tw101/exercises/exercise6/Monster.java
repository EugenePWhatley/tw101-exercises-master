package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Eugene on 6/3/2015.
 */
public interface Monster {
    public abstract void takeDamage(int amount);
    public abstract String name();
    public abstract int currentHitPoints();
}
