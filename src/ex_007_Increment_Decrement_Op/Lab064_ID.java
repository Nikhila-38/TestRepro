package ex_007_Increment_Decrement_Op;

public class Lab064_ID {
    public static void main(String[] args) {
        int a = 20;
        int result = ++a; // 1+20 = 21
        System.out.println(a); // 21
        System.out.println(result); // 21

    }
}
//++a is the pre-increment operator. It increments the value of a before assigning it to result.
/*When you see ++ before the variable like this
        --> Int result= ++a
    ( in this case a value 21 first stored in result then because of the y++ 26+1 = 27
   happen that's why later Y  is 21 and Result is still 21 */