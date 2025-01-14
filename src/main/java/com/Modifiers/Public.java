package com.Modifiers;

public class Public {
    public int d = 40;
    public void method3(String str1, String str2){
        System.out.println(str1+str2);
    }

    public static void main(String[] args) {
        Public publicTest = new Public();
        System.out.println(publicTest.d);
        publicTest.method3("JAVA","Learning");
    }
}
