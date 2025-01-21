package com.oops.Abstraction;


abstract class Text
{
    // static, non-static variables and methods
    // Abstract methods and non-abstract methods
    abstract void method();//abstract method
}

public class Abstraction extends Text {
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.method();
    }
    @Override
    void method(){
        System.out.println("Abstract method - Abstract class");
    }
}
