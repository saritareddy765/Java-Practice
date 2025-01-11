package com.LoopsAndConditions.Conditions;

public class elseIfCondition {
    public static void main(String[] args) {
        int marks = 85;
        if(marks >= 90){
            System.out.println("Distinct");
        } else if (marks >=80 && marks < 90) {
            System.out.println("Grade A");
        } else if (marks >=35 && marks < 80) {
            System.out.println("Grade B");
        }else {
            System.out.println("Failed");
        }
    }
}
