package com.keywords.staticKeyword;

public class StaticKeyword {
    //variables
    int rollnum;
    char grade;
    static String city = "Tenali";
    //methods
    static void display1(){
        System.out.println("static display method");
    }
    void display2(){
        System.out.println("non static method");
    }

    public static void main(String[] args) {
        //object creation is not required for static variables and methods
        System.out.println(city);//same class we can call
        display1();
        //applying methods by using className.variable.method
        System.out.println(StaticKeyword.city.length());
        //non static variable create an object
        StaticKeyword staticKeyword = new StaticKeyword();
        System.out.println(staticKeyword.rollnum);
        staticKeyword.grade = 'A';
        System.out.println(staticKeyword.grade);
        staticKeyword.display2();
    }
}
