package ex_004_Operators;

public class Lab036_All_Operators {

    public static void main(String[] args) {
        boolean b1 = true;
        int a = 25;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a !=b);

        // Arithmetic Operators
        // +,-,%,/,*

        // Relational Operators
        // > , < , >= <=, !, != , == (compare two value)

        // Logical Operators
        //  OR or and , || , && , !

        // Optional to learn - Digital Electronics
        // Bitwise Operator - Not important for Automation
        //
        // ~ - Bitwise Not,
        // >> - Right shift,
        // << Left Shift,
        // ^ - XOR

        // Compound Assignment Operators
        //     // +=, -=, /=, *=
        int age = 10;
        age /=10;// compound operator is /=
       // age -= 10;
        // age +=10;
        System.out.println(age);


    }
}
