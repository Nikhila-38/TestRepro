package ex_006_Ternary_Operator;

public class Lab052_Min_num {
    public static void main(String[] args) {

         // The min number between two numbers by using ternary operator.
              int x = 24;
              int y = 20;
        //    System.out.println(Math.max(x,y));

              int min = x < y ? x : y;
               System.out.println(min);
    }
}
