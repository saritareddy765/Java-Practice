package com.oops.Interface;

interface Book
{
  int numOfPages = 150; // final static variable
  String author = "JAVA"; // final static
     // abstract method
    void method1();
    // default or static method will specify
    default void  method2(){
        System.out.println("Default method");
    }
    static void method3() {
        System.out.println("Static method");
    }
}
public class DemoInterface implements Book {
    @Override
   public void method1(){
        System.out.println("Abstract method code");
    }
    void method4(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        // case1
        DemoInterface demoInterface = new DemoInterface();
        demoInterface.method1();
        demoInterface.method2();
        demoInterface.method4("Selenium");
        // using interface we call the static method but not in child class
        Book.method3();
        // case 2 using the interface reference to call the Child class object
        Book book = new DemoInterface();
        book.method1();
        book.method2();
        Book.method3();

    }
}
