package com.Torres;

public class Main {

    public static void main(String[] args) {

        float [] numbers = new float[20];

        numbers[0] = 1f;
        numbers[1] =2f;
        numbers[2] =3f;
        for (int i=0; i<numbers.length;i++)
        {
            numbers[i] +=1f;
            System.out.println(numbers[i]);

        }
    }
}
