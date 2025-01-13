package com.oops.inheritance.SingleInheritance;

public class SingleInheritance extends ClassB {
    public static void main(String[] args) {
        //with inheritance relationship
        SingleInheritance singleInheritance = new SingleInheritance();
        singleInheritance.print();
        singleInheritance.child();
        System.out.println("single");

        //without inheritance- no relationship
        ClassB classB = new ClassB();
        classB.child();
        classB.show();
        classB.print();
    }
}
