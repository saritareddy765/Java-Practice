package com.Modifiers;

public class Private {
    private int a = 10; //Private variable
    // private method
    private void  method(){
        System.out.println("private test method");
    }

    public static void main(String[] args) {
        Private test = new Private();
        test.method();
        System.out.println(test.a);
    }
}
