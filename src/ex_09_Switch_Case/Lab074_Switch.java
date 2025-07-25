package ex_09_Switch_Case;

import java.util.Scanner;

public class Lab074_Switch {
    public static void main(String[] args) {

        // Week days
        //Mon - Sun : 1(Mon) - 7(Sun)
        // Default or error : if we select 8

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Day 1 to 7");// this statement should be written in this way only
        int Day = scanner.nextInt();

        switch (Day){ // one condition with many statements,it should satisfy at aleast any one Condition from 1 to 7
            case 1:
                System.out.println("Monday");
                break; // keyword
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            case 8:
                System.out.println("Default or error");
                break;


        }










    }
}
