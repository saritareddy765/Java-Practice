package com.oops.inheritance.MultipleInheritance;

interface InterfaceA {
    default void display() {
        System.out.println("Default method from InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Default method from InterfaceB");
    }
}

class MultipleInheritanceWithDefaults implements InterfaceA, InterfaceB {
    @Override
    public void display() {
        System.out.println("Overridden default method to resolve ambiguity.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        MultipleInheritanceWithDefaults obj = new MultipleInheritanceWithDefaults();
        obj.display();
    }
}
