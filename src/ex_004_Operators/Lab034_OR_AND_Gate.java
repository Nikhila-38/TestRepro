package ex_004_Operators;

public class Lab034_OR_AND_Gate {
    public static void main(String[] args) {

        //  || --> OR Operator : if all are 0's then 0, if not 1

        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // && -->AND Operator : if all are 1's then 1, if not 0

        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


    }
}
