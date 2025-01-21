package com.oops.Interface.MultipleInheritance;

public class MultipleInheritance implements Interface1, Interface2 {
    @Override
    public void method2(){
        System.out.println("Method2 from Interface2");
    }
    @Override
    public void method1(){
        System.out.println("Method1 from Interface1");
    }
    public static void main(String[] args) {
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.method1();
        multipleInheritance.method2();
        System.out.println(multipleInheritance.a);
        System.out.println(multipleInheritance.b);

    }
}
