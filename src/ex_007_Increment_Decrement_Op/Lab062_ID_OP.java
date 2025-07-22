package ex_007_Increment_Decrement_Op;

public class Lab062_ID_OP {
    public static void main(String[] args) {

        int a = 15; // int : Data type, a = reference variable and 15 : reference value
        int b = ++a; // b:RV, ++a : prefix a (++ : 1 value)

        // b = 15+1 = 16

        System.out.println(a);
        System.out.println(b);

        //  Exp and Result Table
        // Line No | a | Result b
        //  6 | 15 | NA
        //  7 | 16 | 16

    }
}
