package ex_09_Switch_Case;

public class Lab084_JDK13Above {

    public static void main(String[] args) {
        // in JDK >13
        //No need of break keyword
        //one line supported

        int itemcode = 005;
        switch (itemcode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 005 -> System.out.println("005");

    // if itemcode matches the case, then output is displayed
        }
    }
}
