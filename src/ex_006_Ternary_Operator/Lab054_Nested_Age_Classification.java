package ex_006_Ternary_Operator;

public class Lab054_Nested_Age_Classification {
    public static void main(String[] args) {
        //Here condition has expression and that expression has another condition

        // age = 25
        // age < 18 --> Minor
        // 18 < age > 65 -->Adult
        // age > 65 -->Senior Citizen

        // int age = 74;
        int age = 16;
        String result = (age < 18) ? "Minor" : (age > 65) ? "Adult": "Senior";
        System.out.println(result);

    }
}
