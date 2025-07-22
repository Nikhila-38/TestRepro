package ex_007_Increment_Decrement_Op;

public class Lab065_ID {
    public static void main(String[] args) {

        int y = 26;
        int result = y++; // 26 + 1 = 27
        System.out.println(y); // 27
        System.out.println(result); // only y value = 26


    }
}
    /*When you see ++ after the variable like this
        --> Int result= y++
    ( in this case y value 26 first stored in result then because of the y++ 26+1 = 27
   happen that's why later Y  is 27 and Result is still 26 */