package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Created by Eugene on 6/3/2015.
 */
public class UserInput {
    public int input(){
        String input;
        Integer in;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter player's guess: ");
        input = keyboard.next();
        try {
            in = parseInt(input);
        } catch (Exception e){
            System.out.println("Incompatible input, giving guess of zero");
            return 0;
        }

        return in;
    }
}
