package ex_006_UserInput;

public class Lab056_UserInput_CLI { // CLI : Command line input
    public static void main(String[] args) {

        // Here we can change value and pass the args values like 18 for main method by using edit config
        //Also we we can pass multiple values and strings values can be converted to Int but not strings gets converted to int
        String age_string = args[0];
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);// using ParseInt we are converting String to Int
        String canIVote = age >= 18 ? "Yes" : "No"; // > will show No and >= shows Yes, because 18 is not greater than 18
        System.out.println(canIVote);

    }
}
