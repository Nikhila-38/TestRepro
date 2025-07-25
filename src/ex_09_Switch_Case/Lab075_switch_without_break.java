package ex_09_Switch_Case;

import java.util.Scanner;

public class Lab075_switch_without_break {
    public static void main(String[] args) {

        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day) { // here all days will be displayed, if we enter any number

            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");
                case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid, day number");


        }
    }
}


