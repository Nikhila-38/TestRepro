package ex_08_If_Condition;

public class Lab071_If_pgm1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]); // we use parse int to convert String to Integer

        if (age > 18){
            System.out.println("Can create a account in FB");
        }
        else {
            System.out.println("Not allowed to create");
        }
    }
}
// in edit config, we have enter value and run the pgm
