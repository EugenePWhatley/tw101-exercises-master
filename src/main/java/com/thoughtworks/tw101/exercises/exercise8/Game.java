package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by Eugene on 6/3/2015.
 */
public class Game {
    private final int number;
    private Player player;


    public Game(Player player) {
        this.player = player;
        number = new RandomNumber().generate();
        System.out.println(number);
    }

    public void start(){
        while(!isCorrect());
        System.out.println("Correct!");
        System.out.println("Player guessed: ");
        for (Integer guess : player.guesses()) {
            System.out.print(guess + " ");
        }
    }

    private boolean isCorrect() {
        player.guess();
        if (player.number() > number) {
            System.out.println("Too high");
            return false;
        } else if (player.number() < number) {
            System.out.println("Too Low");
            return false;
        } else {
            return true;
        }
    }
}
