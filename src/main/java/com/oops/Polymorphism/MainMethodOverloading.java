package com.oops.Polymorphism;

public class MainMethodOverloading {
    void main(){ // no inputs
        System.out.println("no inputs");
    }
    void main(int x){ // one int data type input
        System.out.println("int data type input: "+x);
    }
    void main(String str){ // one string input
        System.out.println("String input:"+str);
    }
    void main(int x, int y){ // two inputs
        System.out.println("X value is: "+x+ " Y value is: "+y);
    }

    public static void main(String[] args) {
        MainMethodOverloading mmo = new MainMethodOverloading();
        mmo.main();
        mmo.main(100);
        mmo.main("JAVA");
        mmo.main(10,20);
    }
}
