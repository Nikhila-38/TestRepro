package ex_11_While_Loop;

import java.util.Scanner;

public class Lab0106_While_Intervw_Factorial {
    public static void main(String[] args) {
                                                        // Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Factorial Pgm\nEnter the number");
        if(!scanner.hasNextInt()){ //if we enter string instead of Int
            System.out.println("Enter the Int");
            return;// this stmt exit the pgm
        }
        int number = scanner.nextInt();


        if(number<0){ // to verify number is less than 0
            System.out.println("Negative Factorial is not allowed");
            return;
        }

        // By Default if 0! =1
        int factorial = 1;   // here values will be change as 1,2,3,4,5
        if (number<=0){
            System.out.println(factorial);
        }
        else {
            for(int i = 1; i <= number;i++){ // 1<=5,2<=5,3<=5,4<=5 and 5<=5
                factorial = factorial*i; // factorial = 1 // values will be change from 1-5
            }
        }
        System.out.println("Factorial is :" +factorial);
    }
}
// We need to DeBUG this pgm(click on 19 and 10 line,then red dot will be displayed ,right click select debug.
// enter eg : 5, in console and  then on Step over button in Thread & Variables
//  then else condition will be executed
// Formula of FACTORIAL : 5
//5!=5×4×3×2×1=120
//3! = 3*2*1 = 6