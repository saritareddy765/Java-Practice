package com.oops.inheritance.HierarchicalInheritance;

public class HierarchicalInheritance extends BaseClass {
    public void hierarchical() {
        System.out.println("hierarchical");
    }

    public static void main(String[] args) {
        HierarchicalInheritance hierarchicalInheritance = new HierarchicalInheritance();
        hierarchicalInheritance.hierarchical();

        //ClassA derived
        DerivedClassA classA = new DerivedClassA();
        classA.derivedClassA();
        classA.baseClass();

        //ClassB derived
        DerivedClassB classB = new DerivedClassB();
        classB.baseClass();
        classB.derivedClassB();

        //ClassC derived
        DerivedClassC classC = new DerivedClassC();
        classC.baseClass();
        classC.derivedClassC();


    }
}