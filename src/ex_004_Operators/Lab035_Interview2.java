package ex_004_Operators;

public class Lab035_Interview2 {
    public static void main(String[] args) {

        int Priya_Salary = 8000;
        boolean P = !(Priya_Salary > 5000 || Priya_Salary < 3000);
        System.out.println(P);

         // A - Priya_Salary > 5000 = 8000 > 5000 = true
        // B - Priya_Salary <  3000 = 8000 < 3000 = false
        // TRUE || FALSE = True
        // !TRUE  = FALSE

        // !(A || B) -> !(true || false) -> !true - false

    }
}
