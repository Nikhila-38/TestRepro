package ex_10_For_Loop;

public class Lab093_For_if_Loop {
    public static void main(String[] args) {
        for(int Jai = 0;Jai < 18; Jai++){
            // here 0 to 17 is result and 18 times it will run
            if(Jai > 12) {
                System.out.println("Car"); // here 0 to 12 (means 13 times ,chocolates)
            }
            else {
                System.out.println("Chocolates");

                // here If condition is executed for 5 times, for(Jai <18) and if (Jai>12). 18-13 = 5 times
            }
        }
    }
}
