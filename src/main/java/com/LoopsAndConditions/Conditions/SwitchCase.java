package com.LoopsAndConditions.Conditions;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 7;
        switch (day){
            case 0:
            case 1:
                System.out.println("Sunday");// executed when case 0 and 1 is satisfied
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");

            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not matched");
        }
    }
}
