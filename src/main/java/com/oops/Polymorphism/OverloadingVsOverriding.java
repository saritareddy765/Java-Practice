package com.oops.Polymorphism;

 // Parent class
class Parent {
    // Method to be overridden
    void display() {
        System.out.println("Parent class method.");
    }

    // Overloaded method in the parent class
    void show(String message) {
        System.out.println("Message from Parent: " + message);
    }
}

// Child class
class Child extends Parent {
    // Overriding the display method
    @Override
    void display() {
        System.out.println("Child class method (overridden).");
    }

    // Overloaded method in the child class
    void show(String message, int number) {
        System.out.println("Message from Child: " + message + ", Number: " + number);
    }
}
// Main class
public class OverloadingVsOverriding {
    public static void main(String[] args) {
        //overloading example
        System.out.println("Overloading Example:");
        Child child = new Child();
        child.show("Hello from Child");          // Parent's overloaded method
        child.show("Overloaded in Child", 10);// Child's overloaded method

        System.out.println("*******************");
        System.out.println("Overriding Example:");
        // Overriding Example
        Parent parent = new Parent();
        parent.display(); // Parent's display method

        Parent obj = new Child(); // Dynamic method dispatch
        obj.display(); // Child's overridden display method

    }
}
