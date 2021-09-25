package com.gdstruc.midterm;


import java.util.EmptyStackException;

public class ArrayStack {
    private Card[] stack;
    private int top;


    public ArrayStack(int capacity)
    {
        stack = new Card[capacity];
    }

    public void push(Card player)
    {
        if (top == stack.length) // stack is full
        {
            Card[] newStack = new Card[2 * stack.length]; // resizing the array
            System.arraycopy(stack, 0, newStack, 0, stack.length); //sr copies from 0
            stack = newStack;
        }

        stack[top++] = player; // push
    }

    public Card pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Card poppedPlayer = stack[--top];
        stack[top] = null; //set to null so we don't have "garbage value"
        return poppedPlayer;
    }


    public Card peek()
    {
        if (isEmpty()) //safety net
        {
            throw new EmptyStackException();
        }

        return stack[top-1]; // top value should always be empty~ it should be the next available
    }
    public boolean isEmpty()
    {
        return top ==0; //stack is empty if value of top is 0
    }


    public void printStack()
    {

        for (int i = top -1; i >=0; i--) //print from top to bottom
        {
            System.out.println(stack[i]);
        }
    }
}

