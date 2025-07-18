package ex_005_Typecasting;

public class Lab046_Typecasting_Narrowing {
    public static void main(String[] args) {
        int val = 500;
        // byte b = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.

        byte b1 = (byte)val; // converting (int to byte) - Explicit casting is allowed

        System.out.println(b1);

    }

}
/*When converting 500 to a byte:

        500 % 256 = 244 (because byte range is 256 values)

Java interprets 244 in byte as a signed value → -12*/