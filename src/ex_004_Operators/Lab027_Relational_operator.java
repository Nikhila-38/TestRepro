package ex_004_Operators;

public class Lab027_Relational_operator {
    public static void main(String[] args) {

        // < Less than
        // <= -->Less than or equal to
        // > Greater than
        // >= --> Greater than or equal to
        // == -->Equal to
        // != --> Not equal to

        // Defination : All of them will result boolean output.

        int a = 25;
        int b = 28;

        boolean c = a > b;
        System.out.println(c);

        boolean c1 = a < b;
        System.out.println(c1);

        boolean c2 = a >= b;
        System.out.println(c2);

        System.out.println();// used for spacing

        int age_Hari = 25;
        int age_Lily = 24;

        boolean result =  (age_Lily > age_Hari);
        boolean result1 = (age_Hari < age_Lily);
        boolean result2 = (age_Hari >= age_Lily);
        boolean result3 = (age_Lily <= age_Hari);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
