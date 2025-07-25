package ex_09_Switch_Case;

public class Lab085_JDK13 {
    public static void main(String[] args) {

        int itemcode = 02;
        switch (itemcode) {  // multiple cases with one statement
            case 01,02,05 :
                System.out.println("Apple");
                //System.out.println("Orange");
                //System.out.println("Kiwi");
                break;
            case 04,03 :
                System.out.println("Pine");
               // System.out.println("Watermelon");
                break;
            default:
                System.out.println("None");
        }



    }
}
