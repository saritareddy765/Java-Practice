package com.keywords.superKeyword;
class Car {
    int speed = 100;
    void accelerate(){
        System.out.println("accelerate method in the parent class");
    }
}
class BMW extends Car {
    int speed = 150;//overridden variable
    void displaySpeed(){
        System.out.println(speed);//child class variable
        System.out.println(super.speed);// immediate parent
    }
    void accelerate(){ //overriddem method
        System.out.println("accelerate method in the child class");
        super.accelerate();//calling immediae parent class method
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.displaySpeed();
        bmw.accelerate();
    }
}
