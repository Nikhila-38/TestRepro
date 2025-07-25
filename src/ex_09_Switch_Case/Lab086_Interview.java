package ex_09_Switch_Case;

public class Lab086_Interview {
    public static void main(String[] args) {
        int s = 12;// here this is provide to confuse
        switch (-1){
            default :
            System.out.println("Default");
            break;
            case -1:
                System.out.println("10"); // here switch condition and case -1  are matching together, so the output is 10
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
