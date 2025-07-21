package ex_006_UserInput;

public class Lab_057_Usernput_CLI2 {
    public static void main(String[] args) {


        System.out.println(args[0]); // Java. lang.ArrayIndexOutofBounds Exception EXCEPTION
        System.out.println(args[1]);
        System.out.println(args[2]); // Passing values in edit config like 18 25 43
        // Now pass 65 in config and run
        System.out.println(args[10]); // in config file we didn't pass 10 value, so exception is displayed
        // like java.lang.ArrayIndexOutOfBoundsException
    }
}
