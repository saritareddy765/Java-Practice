package com.Basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int i = 7;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));  // 15
        System.out.println("Subtraction: " + (a - b));  // 5

        // Relational Operators
        System.out.println("a is greater than b: " + (a > b));  // true

        // Logical Operators
        System.out.println("Logical AND: " + (a > 5 && b < 10));  // true

        //Assignment OPerators
        i *= 5;
        System.out.println(i); //35

        // Unary Operators
        int c = 10;
        System.out.println("Pre-increment: " + (++c)); // 11
        System.out.println("Post-increment: " + (c++)); // 11
        System.out.println("After Post Increment"+ c); // 12

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);  // 10
    }
}
