package com.keywords;

public class StaticMain {
    public static void main(String[] args) {
        //calling static variables and methods
        System.out.println(StaticKeyword.city);//in another class so call by className.variable
        StaticKeyword.display1();
        //calling non-static variables and methods
        StaticKeyword staticKeyword1 = new StaticKeyword();
        System.out.println(staticKeyword1.grade);
        staticKeyword1.display2();
    }
}
