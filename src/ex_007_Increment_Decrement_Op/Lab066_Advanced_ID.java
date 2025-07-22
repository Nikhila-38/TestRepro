package ex_007_Increment_Decrement_Op;

public class Lab066_Advanced_ID {
    public static void main(String[] args) {

        int r = 12;
        System.out.println(r++ + r);

        // A + B
        // A -> r++ -> ExpA -> 12 ,incremented to r = 13
        // +
        // B -> r -> ExpB , ExpB -> 13 , r = 13

        // Line No.|  r |  Expression
        // 6 | 12 | NA
        // 7 | 13 | 12+13 -> 25

        // Expression	When Increment Happens	Value Stored in Variable
        // ++t	Before assignment	Incremented value
        // t++	After assignment	Original value
    }
}
