package com.gdstruc.midterm;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        ArrayStack playerDeck = new ArrayStack(30);
        System.out.println("\nPlayer Deck:");
        for (int i =0; i <10; i++)
        {
            playerDeck.push(new Card("Spade"));
            playerDeck.push(new Card("Diamond"));
            playerDeck.push(new Card("Heart"));

        }
        playerDeck.printStack();

        CardStack discardedPile = new CardStack();

        int number = 1;
        int turn = 0;
        int divide = 2;
        int checkTurn = turn%divide; //QUESTION: What exactly are the turns?
//Because it doesn't look like I am fighting anyone?

        while (!playerDeck.equals(0)) { //How to not equal 0?
            int min = 1;
            int max = 5;
            int random = (int)(Math.random()*(max-min+1)+min);
//Also, im confused because in the video it said we will need to use user input
            //however in the instructions it says the commands are random?
            System.out.println(("What would you like to do? :"));
            System.out.println(("Draw, Discard or Get ?"));
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            turn++;

            if(input.equals("Draw"))
            {
                System.out.println("You drew " + random + " amount of cards.");
                for (int i=0; i < random; i++) {
                    playerDeck.push(new Card("New"));
                }
            }
            if(input.equals("Discard"))
            {
                System.out.println("You discarded " + random + " amount of cards.");
                for (int i =0; i< random; i++) {
                    playerDeck.pop();
                    discardedPile.push(playerDeck.peek());
                }
            }
            if(input.equals("Get"))
            {
                System.out.println("You got " + random + " amount of cards.");
                for (int i =0; i< random; i++) {
                    discardedPile.peek();
                    playerDeck.push(discardedPile.peek());
                    discardedPile.discard();
                }
            }
            else
            {
                System.out.println("Command unrecognized. Please try again");
            }
            System.out.println(("\nPlayer deck :"));
            playerDeck.printStack();
            System.out.println(("\nDiscarded pile:"));
            discardedPile.printStack();

        }
    }
}
