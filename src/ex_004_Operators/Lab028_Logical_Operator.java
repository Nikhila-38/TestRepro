package ex_004_Operators;

public class Lab028_Logical_Operator {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a); // output will be displayed in opposite(here !-->not)

        boolean b = false;
        System.out.println(!!b); // same (here double not)

        boolean c = true;
        System.out.println(!!c);

        boolean l = true || false; // 1 or 0 = 1 (true)
        // OR Operator : if all are 0's then 0, if not 1
        System.out.println(l);

        boolean l1 = true && false; // 1 and 0 = 0(false)
        // AND Operator : if all are 1's then 1, if not 0
        System.out.println(l1);

    }
}
