package ex_09_Switch_Case;

import java.util.Scanner;

public class Lab076_switch_without_default {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day = scanner.nextInt();

        switch (day){
            case 1 :
                System.out.println("MONDAY");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
       // Note : in console, If we enter 2, Tuesday will be displayed.
            // if 8 : no response
        }


    }
}
