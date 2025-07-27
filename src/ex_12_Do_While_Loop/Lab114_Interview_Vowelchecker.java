package ex_12_Do_While_Loop;

import java.util.Scanner;

public class Lab114_Interview_Vowelchecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);  // convert to lowercase

        // Using Switch case
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("consonants");
        }
    }
}
//        //Using If else
//        // Check if it's a vowel
//                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                    System.out.println(ch + " is a vowel.");
//                } else if ((ch >= 'a' && ch <= 'z')) {
//                    System.out.println(ch + " is a consonant.");
//                } else {
//                    System.out.println("Invalid input. Please enter an alphabet character.");
//                }
//
//                scanner.close();
//            }




