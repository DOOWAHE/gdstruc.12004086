package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {
	 Player asuna = new Player(1, "Asuna", 100);
	 Player lethalBacon = new Player(2, "LethalBacon", 205);
	 Player hpDeskjet = new Player(3, "HPDeskjet", 34);

	 PlyerLinkedl playerLinkedList = new PlyerLinkedl();

	 playerLinkedList.addToFront(asuna);
	 playerLinkedList.addToFront(lethalBacon);
	 playerLinkedList.addToFront(hpDeskjet); //this is the first element
        //this is because we place the new element in front of our list.

		playerLinkedList.printList();
    }
}
