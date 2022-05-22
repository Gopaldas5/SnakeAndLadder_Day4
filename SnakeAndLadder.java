package com.bridgeLabz.Day4_SankeAndLadderProblem;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1 = 0;
        System.out.println("Welcome to snake and ladder game simulator");
        System.out.println("First player is at initial position "+player1);
        Random random = new Random();
        int DiceNum = random.nextInt(6)+1;
        System.out.println("Rolling the dice and get the number by player1:- "+DiceNum);


    }
}
