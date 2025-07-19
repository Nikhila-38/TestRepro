package ex_006_Ternary_Operator;

public class Lab049_TO {
    public static void main(String[] args) {
        // Age to vote
        int age = 10; // person age is 10
        String CanIVote = age > 18 ? "Yes": "No"; // Here condition is Age must be greater than 18, then he can vote else No.
        // ? condition meets and : acts as else
        System.out.println(CanIVote);
    }
}
