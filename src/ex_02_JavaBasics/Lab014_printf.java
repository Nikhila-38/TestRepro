package ex_02_JavaBasics;

public class Lab014_printf {
    public static void main(String[] args) {
        int a = 16;
        System.out.print("print command, without new line");

        System.out.println("Hello World");
        System.out.println("add  the new line in the end");

        System.out.println(a);

        System.out.printf("Your variable name is %d",a);
        // if we add %d, then %d value will replace value of a)

        // %d -> int, byte, long, short - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int b = 58;
        System.out.println(" ----- ");
        //System.out.printf("%d + %d",a,b); //here the output will be displayed as 16+58, but not 74

        System.out.printf("%d * %d", a,b); // same

    }
}
