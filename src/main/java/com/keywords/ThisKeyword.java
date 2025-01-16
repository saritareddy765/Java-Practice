package com.keywords;

public class ThisKeyword {
    //variables
    int x,y; // instance variables-mapped to object memory
    ThisKeyword(){

    }
    ThisKeyword(int x, int y){ //it is a parameterized constructor method
        // a and b variables are local variables

        this.x = x;
        this.y = y;
        // initialize the variable values
    }
    //methods
    void setData(int x, int y){
        // instead give x&y use this keyword refer to instance or it will refer local variables
        x = x;
        y = y;
        System.out.println(x);
        System.out.println(y);
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword(100,200);
        thisKeyword.setData(10,20);
        thisKeyword.display();
        ThisKeyword obj = new ThisKeyword();
        obj.display2();
    }
    void display1(){
        System.out.println("display1 method");
    }
    void display2(){
        //display1();//implicit calling using this keyword
        this.display1();
        System.out.println("display2 method");
    }
}
