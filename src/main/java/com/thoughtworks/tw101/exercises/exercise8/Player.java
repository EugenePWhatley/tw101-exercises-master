package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by Eugene on 6/3/2015.
 */
public class Player {
    private int number;
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void guess() {
        number = new UserInput().input();
        guesses.add(number);
    }

    public int number() {
        return number;
    }

    public ArrayList<Integer> guesses(){
        return guesses;
    }
}
