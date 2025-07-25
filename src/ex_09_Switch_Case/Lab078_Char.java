package ex_09_Switch_Case;

public class Lab078_Char {
    public static void main(String[] args) {
        char ch ='A'; // ASCII value of A is 65
        switch (ch){ // Char is also an Integer

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("Not Match");
        }

    }
}
