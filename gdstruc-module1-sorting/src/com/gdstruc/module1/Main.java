package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0]= 10;
        numbers[1]= -3;
        numbers[2]= 45;
        numbers[3]= 512;
        numbers[4]= 300;
        numbers[5]= -20;
        numbers[6]= 5;
        numbers[7]= 97;
        numbers[8]= 211;
        numbers[9]= 4;

        System.out.println("QUIZ 1:");
        System.out.println("\n\n #1: bubble and selection sort in descending order ");
        System.out.println("\n\nBefore bubble/selection sort");
        printArrayElements(numbers);

        System.out.println("\n\nAfter bubble sort");
        bubbleSort(numbers);
        printArrayElements(numbers);


        System.out.println("\n\nAfter selection sort");
        selectionSort(numbers);
        printArrayElements(numbers);
    }
    private static void bubbleSort(int[] arr)
    {

        for(int lastSortedIndex = arr.length-1;lastSortedIndex > 0 ; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
            for(int lastSortedIndex = arr.length - 1; lastSortedIndex >0; lastSortedIndex--)
            {
                int smallestIndex = 0;

               for(int i=1; i< lastSortedIndex;i++)
               {
                   if (arr[i] < arr[smallestIndex])
                   {
                       smallestIndex = i;
                   }
               }
               int temp = arr[lastSortedIndex];
               arr[lastSortedIndex] = arr[smallestIndex];
               arr[smallestIndex]= temp;
            }
    }
    private static void printArrayElements (int[] arr)
    {
        for (int j : arr) {
            System.out.print(j+ " ");
        }
    }
}
