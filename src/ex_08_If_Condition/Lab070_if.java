package ex_08_If_Condition;

import java.util.Scanner;

public class Lab070_if {
    public static void main(String[] args) {

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){ // if the condition (age >18) is satisfied, the Output will be displayed.(Boolean values are used)
            System.out.println("Allowed to Vote!");
        }
    }
}
// Note : in console, we enter the values which are greater than 18 like 19,20,25 , then Allowed to vote should be displayed