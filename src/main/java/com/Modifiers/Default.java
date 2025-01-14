package com.Modifiers;

public class Default {
    int b = 20;//default variable
    //default method
    void method1(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Default defaultTest = new Default();
        defaultTest.method1("default");
        System.out.println(defaultTest.b);
    }
}
