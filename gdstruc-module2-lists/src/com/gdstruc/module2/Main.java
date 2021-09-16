package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();//default initial capacity is 10

        //add function adds at the end of the array
        playerList.add(new Player(1, "Asuna", 100));
        playerList.add(new Player(2, "LethalBacon", 205));
        playerList.add(new Player(3, "HPDeskjet", 34));


        //accessing a single element in array list
        //this is o(1). This outpus lethal bacon. Starts with 0.
        System.out.println(playerList.get(1));

        //inserting an element will have o(n). After inserting, it shifts all the elements
        //one step to the right from the right of the index.

        playerList.add(2,new Player(553, "Arctis", 55 ));

        //removing an element
        playerList.remove(2 );//notice that Arctis is now missing

        //contains, returns true if eleement is in list.
        //System.out.println(playerList.contains(new Player(2, "LethalBacon", 205)));
        //This returns false bcecause this is a new instance of another player
        //to fix that go to class and override equal


        System.out.println(playerList.indexOf(new Player(2,"LethalBacon", 205)));
        //lambda method
        //playerList.forEach(player -> System.out.println(player));

        //this is also good :3
       // for (Player p: playerList)
        //{
         //   System.out.println(p);
        //}
    }
}
