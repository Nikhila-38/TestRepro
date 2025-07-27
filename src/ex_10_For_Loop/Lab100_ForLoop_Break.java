package ex_10_For_Loop;

public class Lab100_ForLoop_Break {

    public static void main(String[] args) {
        //if loop cannot have break statement but for loop can have break

       for (int i = 0; i < 50; i++) { // 0-49 , 50 times
            if (i == 5) { // here form 0-4 will be executed ,because the condition is till 5
                break;
            }
            else {
                System.out.println(i);

            }
              }
    }
}
