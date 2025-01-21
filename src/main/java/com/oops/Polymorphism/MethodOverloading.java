package com.oops.Polymorphism;

public class MethodOverloading {
    //variables
    int a, b;

    String text;
    String firstName;
    String lastName;
    //methods
    //method overloading
    void sum(){ //case1 - no inputs
        a = 10;
        b = 20;
        System.out.println(a+b);
    }
    void sum(int x, int y){ //case2 - two inputs
        System.out.println(x+y);

    }
    void sum(int x, double y){ //case3 - two inputs - different data types
        System.out.println(x+y);
    }
    void sum(double x, int y){ // case4 - two inputs - order of data type is changed
        System.out.println(x+y);
    }
    void sum(int x, int y, int z){ //case5 - three inputs
        System.out.println(x+y+z);
    }
    //constructor overloading
    MethodOverloading(){//default constructor - no inputs
        text = "Hello";
        firstName = "";
        lastName = "";
        System.out.println(text+ " "+firstName+" "+lastName);
    }
    MethodOverloading(String fname){//parameterized constructor with inputs
             text = "Hi";
             firstName = fname;
             lastName = "";
        System.out.println(text+ " "+firstName+" "+lastName);
    }
    MethodOverloading(String fname, String lname){// parameterized constructor with two inputs
        text = "Hello";
        firstName = fname;
        lastName = lname;
        System.out.println(text+ " "+firstName+" "+lastName);
    }

    public static void main(String[] args) {
        //creating object
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.sum();
        methodOverloading.sum(20,30);
        methodOverloading.sum(30.5,20);
        methodOverloading.sum(30,20.89);
        methodOverloading.sum(10,20,30);

        MethodOverloading con = new MethodOverloading("JAVA");
        MethodOverloading cons1 = new MethodOverloading();
        MethodOverloading con2 = new MethodOverloading("JAVA","Learning");
    }
}
