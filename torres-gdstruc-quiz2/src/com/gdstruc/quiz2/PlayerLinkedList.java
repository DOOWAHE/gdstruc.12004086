package com.gdstruc.quiz2;

public class PlayerLinkedList {
    private PlayerNode head;


    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public PlayerNode removeHead()
    {
        head = head.getNextPlayer();
        return head;
    }

    public boolean checkIfContain(Player player)
    {
      PlayerNode current = head;
      while (current!=null)
      {
          if(current.getPlayer()==player)
          {
              return true;
          }
          current = current.getNextPlayer();
      }
      return false;
    }

    public int indexOf(Player player)
    {
       int index =0;
       PlayerNode current = head;
       while(current != null)
       {
           if(current.getPlayer() == player)
           {
               return index;
           }
           current=current.getNextPlayer();
           index++;
       }
       return -1;
    }


    public void printList()
    {
        int size = 0;
        PlayerNode current = head;
        System.out.print("HEAD ->");
        while (current != null)
        {
            System.out.println(current.getPlayer()); //playerclass that prints the two string
            System.out.print("->");
            current=current.getNextPlayer();
            size++;
        }

        System.out.println("current elements present in linked list: " + size);
        System.out.println("null");
    }

}
