package com.Torres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //prints out Hello World
        //System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello" + name);

        String input = "1 fish 22 fish red fish blue fish";
        Scanner fish = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(fish.nextInt());
        System.out.println(fish.nextInt());
        System.out.println(fish.next());
        System.out.println(fish.next());
        fish.close();
    }
}
