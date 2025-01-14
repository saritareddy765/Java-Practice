package com.oops.inheritance.MultipleInheritance;

public class ImplementingClass implements Interface1,Interface2{
    @Override
    public void login(){
        System.out.println("interface1");
    }
    @Override
    public String successPayment(){
        System.out.println("interface2");
        return null;
    }

}
