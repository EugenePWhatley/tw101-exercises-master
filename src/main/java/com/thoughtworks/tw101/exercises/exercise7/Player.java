package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Eugene on 6/3/2015.
 */
public class Player {
    private int number;

    public void guess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player's guess: ");
        number = input.nextInt();
    }

    public int number() {
        return number;
    }
}
