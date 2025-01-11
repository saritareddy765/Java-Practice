package com.LoopsAndConditions.Conditions;

public class NestedIfElseCondition {
    public static void main(String[] args) {
        String result = "pass";
        if(result == "pass"){
            System.out.println("go to next round");
            String round1 = "pass";
            if(round1 == "pass"){
                System.out.println("cleared");
            }else {
                System.out.println("not cleared");
            }
        }else {
            System.out.println("not cleared");
        }
    }
}
