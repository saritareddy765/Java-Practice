package com.oops.Polymorphism;

class ParentClass
{
    void display(){
        System.out.println("Parent display method.");
    }
}
class ChildClass extends ParentClass
{
    @Override
    void display(){
        System.out.println("Child display method.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.display();
        ChildClass childClass = new ChildClass();
        childClass.display();
        ParentClass obj = new ChildClass();
        obj.display();//o/p run time polymorphism
    }

}
