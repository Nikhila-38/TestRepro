package ex_10_For_Loop;

public class Lab098_Confuse {
    public static void main(String[] args) {
       // for(int i = 0;i <= 10;i++){ // not recommended this

            // because i=0 and i<= 10 means the program will run 0 to 10, for 11 times

            for(int i = 0;i < 10; i++){ // Best/ most recommended(always take int i = 0)
                System.out.println(i);  // 0 to 9, 10 times
            }
            for(int i1 = 1; i1 <= 10;i1++){ // 1 to 10, 10 times
                System.out.println(i1);
            }
    }
    }
