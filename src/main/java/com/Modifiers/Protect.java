package com.Modifiers;

public class Protect {
    //protect variable
    protected int c = 30;
    //protect method
    protected void method2(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Protect protect = new Protect();
        System.out.println(protect.c);
        protect.method2("protect");
    }
}
