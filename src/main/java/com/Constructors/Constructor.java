package com.Constructors;

public class Constructor {
    int a;
    //Default Constructor
    public Constructor(){
        a = 10;
        System.out.println(a);
        System.out.println("Default");
    }
    //Parameterized constructor
    public Constructor(int b){
        System.out.println(b);
        System.out.println("Parameterized");
    }
    public Constructor(int c, int d){
        System.out.println(c+d);
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor(4);
        Constructor constructor2 = new Constructor(3,7);

    }
}
