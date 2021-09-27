package com.gdstruc.midterm;

import java.util.Scanner;
import java.lang.Math;


public class Main {
    public static void main(String[] args) {
        System.out.println("NOTE: IF NOTHING HAPPENS ");
        System.out.println("Command recognizes lack of cards ");
        System.out.println("and is re-randomizing command.");

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

        while (playerDeck.size() != 0) {
            int min = 1;
            int max = 5;
            int randomAmount = (int)(Math.random()*(max-min+1)+min);
            int randomCommand = (int)(Math.random()*(3-1+1)+1);



            if (randomCommand == 1)
            {
                System.out.println("COMMAND: D R A W  ");
                System.out.println("You drew " + randomAmount + " amount of cards.");
                for (int i=0; i < randomAmount; i++) {
                    playerDeck.push(new Card("New"));
                }
            }

            if (randomCommand == 2 && randomAmount <= playerDeck.size() ) {
                System.out.println("COMMAND: D I S C A R D ");
                System.out.println("You discarded " + randomAmount + " amount of cards.");
                for (int i = 0; i < randomAmount; i++) {
                    playerDeck.pop();
                    discardedPile.push(playerDeck.peek());
                }
            }

            if (randomCommand == 3 && randomAmount <= discardedPile.size()) {
                System.out.println("COMMAND: G E T ");
                System.out.println("You got " + randomAmount + " amount of cards.");
                for (int i = 0; i < randomAmount; i++) {
                    discardedPile.peek();
                    playerDeck.push(discardedPile.peek());
                    discardedPile.discard();
                }
            }


            System.out.println(("\nPlayer deck :"));
            playerDeck.printStack();
            System.out.println(("\nDiscarded pile:"));
            discardedPile.printStack();
            System.out.println("Press any key to continue");
            new java.util.Scanner(System.in).nextLine();

        }
    }
}
