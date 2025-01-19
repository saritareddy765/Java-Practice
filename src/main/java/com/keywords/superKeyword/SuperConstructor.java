package com.keywords.superKeyword;
class Auto{
    int speed = 100;
    Auto(){
        System.out.println("Auto parent method");
    }
    void accelerate(){
        System.out.println("Parent method");
    }
}
class Volvo extends Auto{
    int speed = 200;
    Volvo(){
        super();//should be in first statement
        System.out.println("Default volvo constructor");
    }

    @Override
    void accelerate() {
        System.out.println("Child class");
        super.accelerate();//immediate parent class variable
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        Volvo volvo = new Volvo();
        //volvo.accelerate();
    }
}
