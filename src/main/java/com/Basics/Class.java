package com.Basics;

public class Class {
    //creation of variables
    public int age = 10;
    String name = "Java";

    public static void main(String[] args) {
        //creation of object
        Class classCreation = new Class();
        System.out.println(classCreation.age);
        classCreation.method();
    }
    //creation of methods
    public void method(){
        System.out.println("creation of method");
    }
    //without void method
    public String method1(){
        return "Java";
    }
}
