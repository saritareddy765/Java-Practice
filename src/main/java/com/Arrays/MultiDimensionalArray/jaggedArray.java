package com.Arrays.MultiDimensionalArray;

public class jaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[5];
        jaggedArray[2] = new int[3];

        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;

        jaggedArray[1][0] = 55;
        jaggedArray[1][1] = 66;
        jaggedArray[1][2] = 88;
        jaggedArray[1][3] = 9;
        jaggedArray[1][4] = 6;


        jaggedArray[2][0] = 5;
        jaggedArray[2][1] = 82;
        jaggedArray[2][2] = 23;

        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

