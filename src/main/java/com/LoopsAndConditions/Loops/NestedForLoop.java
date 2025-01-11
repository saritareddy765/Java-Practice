package com.LoopsAndConditions.Loops;

public class NestedForLoop {
    public static void main(String[] args) {
        int a = 6;
        for (int i=1; i<=a; i++){
            for (int j=1; j<=i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
