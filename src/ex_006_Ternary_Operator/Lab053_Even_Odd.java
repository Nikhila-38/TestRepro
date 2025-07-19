package ex_006_Ternary_Operator;

public class Lab053_Even_Odd {
    public static void main(String[] args) {

        // int num = 20; // This is an Even
        int num = 13;  // This is an Odd
        String result = (num%2 == 0) ? "Even" : "Odd"; // here we are using modules operator % (20%2) or (13%2)
        System.out.println(result);

    }
}
