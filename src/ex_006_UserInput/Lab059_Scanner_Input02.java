package ex_006_UserInput;

import java.util.Scanner;

public class Lab059_Scanner_Input02 {
    public static void main(String[] args) {

        System.out.println("Enter the String"); // String
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());

        /*String s = scanner.next();
        System.out.println(s); */

        System.out.println("Enter the Int"); // Int
        int int_input = scanner.nextInt();

        System.out.println("Enter the Double"); //Double
        double double_input = scanner.nextDouble();

       // System.out.println("Enter the Float"); //Float
        // float float_input = scanner.nextFloat(); // ERROR is displayed for float



    }
}
