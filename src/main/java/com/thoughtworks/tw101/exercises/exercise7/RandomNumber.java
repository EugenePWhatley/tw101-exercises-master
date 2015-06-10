package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Eugene on 6/3/2015.
 */
public class RandomNumber {
    private int number;
    public int generate(){
        number = (int) (Math.random()*100);
        return number;
    }
}
