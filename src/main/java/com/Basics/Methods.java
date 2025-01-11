package com.Basics;

public class Methods {
    //static Method
    public static void test() {
        System.out.println("static");
    }

    public static void main(String[] args) {
        //calling static
        test();
        //calling Non-Static method
        Methods methods = new Methods();
        methods.test1();
        //calling parameterized method
        int c = methods.test2(20,50);
        System.out.println("sum ::"+c);

    }
    //Non-Static Method
    public void test1(){
        System.out.println("non-static");
    }
    //method with parameters
    public int test2(int a,int b){
        return a+b;
    }
}
