package com.Basics;

public class Object {
    int a;
    int b;
    //constructor
    public Object(){
        a = 10;
        b = 20;
    }
    //parameterized constructor
    public Object(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Object object = new Object();
        Object object1 = new Object(15,25);
        Object object2 = new Object(50,30);
        //calling methods
        System.out.println(object.add());
        System.out.println(object1.add());
        System.out.println(object2.sub());
        //calling variables
        System.out.println(object.a);
        System.out.println(object2.b);
    }
    public int add() {
        return a + b;
    }
    public int sub(){
        return a-b;
    }
}
