package com.gdstruc.quiz2;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);


        playerLinkedList.removeHead();
        System.out.println("contains function:");
        System.out.println(playerLinkedList.checkIfContain(lethalBacon));
        System.out.println("index of :");
        System.out.println(playerLinkedList.indexOf(lethalBacon));



        playerLinkedList.printList();
    }
}
