package ex_02_JavaBasics;

public class Lab009_Variable_assignvalue2 {
    public static void main(String[] args) {

        int age = 20; //First variable value is 20(remove),
        age = 20+12; // then 20+12 = 32(remove)
        age = 20; // again 20, So here first 20 and 32 will be removed and then 20 will be present
        System.out.println(age);
    }
}
