package ex_006_Ternary_Operator;

public class Lab051_Max_num {
    public static void main(String[] args) {

        // find Maximum number between two numbers by using ternary
        int x = 45;
        int y = 25;
       // System.out.println(Math.max(x,y));
        // we are not using

        int max = x > y ? x : y; // Ternary operator
        System.out.println(max);

    }
}
