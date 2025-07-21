package ex_006_UserInput;

import java.util.Scanner;

public class Lab058_Scanner_Input01 {
    public static void main(String[] args) {

     // using scanner ,we can pass the values/args
        Scanner scanner = new Scanner(System.in); // important

        System.out.println("Enter the age"); // enter the age

        int age = scanner.nextInt();// imp, // in console mention value
        String canIVote = age >= 18 ? "Yes" : "No";
        System.out.println(canIVote);

        //Note : after run, console asks user to mention value and press enter and again it will run the pgm
    }
}
