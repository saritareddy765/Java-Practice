package com.Basics;

public class Variables {
    //Global variables
    static int a = 10; //static variables
    //instance variable
    String name = "Java";
    public static void main(String[] args) {
        System.out.println("static::"+a);
        //object creation
        Variables var1 = new Variables();
        System.out.println(var1.name);

        //Local variable
        int id = 4;//when the value is known
        //Define and initialization
         int num; // value is unknown
         num = 3;
         //re-assign
        num = 5;
        System.out.println(id);
        System.out.println("num::"+num);
    }
    public static void test(){
        System.out.println("static::"+a);
    }

}
