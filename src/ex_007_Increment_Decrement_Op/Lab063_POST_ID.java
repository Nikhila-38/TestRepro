package ex_007_Increment_Decrement_Op;

public class Lab063_POST_ID {
    public static void main(String[] args) {

        // Pre-increment = first increase then print
        int a= 15;
        System.out.println(++a);
        System.out.println(a);

        // POST increment  = Print first and then increase
        int a_post = 14;
        System.out.println(a_post++);
        System.out.println(a_post);
    }
}


