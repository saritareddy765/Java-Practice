package com.Arrays;

import java.util.stream.IntStream;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and print individual elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Modify an element
        numbers[2] = 35; // Changing the third element to 35
        System.out.println("Modified third element: " + numbers[2]);

        // Print all elements using a for loop
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);

        // Print ArrayIndexOutOfBoundException
            int b[] = {22,55,8};
            for(int j = 0; j<=b.length;j++){
                System.out.println(b[j]);
            }

        }

        // Print all elements using an enhanced for loop
        System.out.println("All elements using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
