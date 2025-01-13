package com.oops.inheritance.MultiLevelInheritance;

public class MultilevelInheritance extends IntermediateClass{
    public void multilevel(){
        System.out.println("Child Class");
    }

    public static void main(String[] args) {
        MultilevelInheritance multilevelInheritance = new MultilevelInheritance();
        multilevelInheritance.baseClass();
        multilevelInheritance.intermediateClass();
        multilevelInheritance.multilevel();
    }
}
