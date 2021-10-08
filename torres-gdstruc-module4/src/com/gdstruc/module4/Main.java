package com.gdstruc.module4;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        ArrayQueue playerList = new ArrayQueue(14);

        playerList.add(new Player(1, "Subroza", 95));
        playerList.add(new Player(2, "ploo", 90));
        playerList.add(new Player(3, "squidyE", 90));
        playerList.add(new Player(4, "Tak0u", 90));
        playerList.add(new Player(5, "Iloveme", 90));
        playerList.add(new Player(6, "Parazi", 90));
        playerList.add(new Player(7, "samNtha", 90));
        playerList.add(new Player(8, "woozi", 90));
        playerList.add(new Player(9, "hoshi", 90));
        playerList.add(new Player(10, "aceu", 100));
        playerList.add(new Player(11, "Sinatraa", 100));
        playerList.add(new Player(12, "Luca", 100));
        playerList.add(new Player(13, "Mimyauhh", 100));
        playerList.add(new Player(14, "Lagou", 100));

        ArrayQueue queuedPlayers = new ArrayQueue(10);
        System.out.println("Input anything to start:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("NOTE: After each round, players are brought back to the list for reuse.");

        int roundOfGames = 10;
        while (roundOfGames != 0) {
            System.out.println("List of All Players:");
            playerList.printQueue();

            System.out.println("Remaining Games:" + roundOfGames);
            int randomAmount = (int) (Math.random() * (7 - 1 + 1) + 1);
            for (int i = 0; i < randomAmount; i++) {
                playerList.peek();
                playerList.remove();
                queuedPlayers.add(playerList.peek());
            }
            System.out.println("\nPlayers Remaining in List:");
            playerList.printQueue();
            if (queuedPlayers.size() < 5 && playerList.size() >= 5) {
                System.out.println("Not enough players. Will add more after you continue code:\n");
                for (int i = randomAmount; i >= 5; i++) {
                    playerList.peek();
                    playerList.remove();
                    queuedPlayers.add(playerList.peek());
                }
            }
            System.out.println("\nQueued players:");
            queuedPlayers.printQueue();
            //this is the game function
            if (queuedPlayers.size() >= 5) {
                System.out.println("Queue has enough players to start!\n");
                for (int i = 0; i < randomAmount; i++) {
                    queuedPlayers.peek();
                    playerList.add(queuedPlayers.peek());
                    queuedPlayers.remove();
                }
                roundOfGames--;
                System.out.println("Moving to the next round!\n");
            }

            System.out.println("Input anything to continue code:\n");
            input = scanner.nextLine();
        }

        System.out.println("The Games have concluded! Congratulations ^_^");
    }
}
