package com.gdstruc.module2;

public class PlyerLinkedl {
    //the only one you need is the HEAD

    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    //you need to set the NULL so tht you know when to stop

    public void printList(){
        PlayerNode current= head;
        System.out.print("HEAD ->");
        while (current!= null){
            System.out.print(current);
            System.out.print("->");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
