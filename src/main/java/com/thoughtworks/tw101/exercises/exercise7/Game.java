package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Eugene on 6/3/2015.
 */
public class Game {
    private final int number;
    private Player player;


    public Game(Player player) {
        this.player = player;
        number = new RandomNumber().generate();
    }

    public void start(){
        while(!isCorrect()){
            if(player.number() > number){
                System.out.println("Too high");
            }
            else if(player.number() < number){
                System.out.println("Too Low");
            }
        }
        System.out.println("Correct!");
    }

    private boolean isCorrect() {
        if(player.number() == number) {
            return true;
        }
        else {
            player.guess();
            return false;
        }
    }

}
