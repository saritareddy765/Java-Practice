package com.oops.Interface.functionalInterface;

@java.lang.FunctionalInterface
interface FuncInterface{
    void method();//abstract method
    default void method1(){
        System.out.println("Default method");
    }
    default void method2(){
        System.out.println("Default method1");
    }
    static void method3(){
        System.out.println("Static method");
    }
    static void method4(){
        System.out.println("Static method1");
    }
}
public class FunctionalInterface implements FuncInterface {
    @Override
    public void method(){
        System.out.println("Abstract method- FunctionalInterface");
    }

    public static void main(String[] args) {
        FunctionalInterface functionalInterface = new FunctionalInterface();
        functionalInterface.method();
        functionalInterface.method1();
        functionalInterface.method2();
        FuncInterface.method3();
        FuncInterface.method4();
    }
}
