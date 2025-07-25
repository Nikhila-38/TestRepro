package ex_08_If_Condition;

import java.util.Scanner;

public class Lab072_If_Else {
    public static void main(String[] args) {

        // Allowed to vote or not
        // if age > 18 = allowed
        //if age < 18 = not allowed

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age <= 18){
            System.out.println("Not allowed");
        }
        else {
            System.out.println("Allowed");
        }
    }
}
