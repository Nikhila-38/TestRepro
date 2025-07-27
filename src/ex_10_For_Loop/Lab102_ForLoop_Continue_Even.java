package ex_10_For_Loop;

public class Lab102_ForLoop_Continue_Even {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) { // 0-50, for 51 times

            if(i%2 == 0){ // here we are skipping EVEN NUMBERS
                continue;
            }
            System.out.println("Odd:"+ i);
        }
    }
}
