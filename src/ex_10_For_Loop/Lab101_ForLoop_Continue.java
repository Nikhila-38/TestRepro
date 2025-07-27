package ex_10_For_Loop;

public class Lab101_ForLoop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){ // runs for 0,1,2,3,4 and skips 5 and then continue till 49 for 50 times
                                           // as i ==5
            if (i == 5){
                continue; //skip the code and move to next
            }
            System.out.println(i);
        }
    }
}
