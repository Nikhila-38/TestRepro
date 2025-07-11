package ex_31_Generics;

public class Lab237_Generics_Method_Fix {
    public static void main(String[] args) {

            display(5,8);
            display(1.25,6.25);
            display("Nik","Lav");

        }

        static <T> T display(T a,T b, T c) {
            System.out.println(a);
            System.out.println(b);
            return null;
        }


        static <T> void display(T a,T b) {
            System.out.println(a);
            System.out.println(b);
        }
    }

