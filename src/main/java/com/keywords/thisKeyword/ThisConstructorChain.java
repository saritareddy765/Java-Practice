package com.keywords.thisKeyword;

public class ThisConstructorChain {
    ThisConstructorChain(){
        System.out.println("default constructor");
    }
    ThisConstructorChain(String str) {
        this();//default constructor
        System.out.println(str);
    }
    ThisConstructorChain(String str, int x){
        //this();//default constructor
        this("Testing");
        System.out.println(str + " "+x);
    }

    public static void main(String[] args) {
        ThisConstructorChain tcc = new ThisConstructorChain("JAVA",100);

    }
}
