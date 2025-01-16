package com.keywords;

public class ThisConstructor {
    ThisConstructor(){
        System.out.println("default constructor");
    }
    ThisConstructor(String str) {
        System.out.println(str);
    }
    ThisConstructor(String str, int x){
        //this();//default constructor
        this("Testing");
        System.out.println(str + " "+x);
    }

    public static void main(String[] args) {
        ThisConstructor tc = new ThisConstructor("JAVA",100);

    }
}
