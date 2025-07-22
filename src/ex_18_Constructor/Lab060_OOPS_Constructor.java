package ex_18_Constructor;

public class Lab060_OOPS_Constructor {
    public static void main(String[] args) {
       Baby b1 = new  Baby();
    }
}
// Note : if no values are given, then Default constructor is consider

class Baby {
    String name;
    // This is called Attributes | Instance Variable |  Member variables, data members

    //Default Constructor
    Baby() {
        System.out.println("I am called a Default constructor");
        System.out.println("Your AAdhar card is ready!");

    }

    //Behavior or Functions

    void cry() {
        System.out.println("Cry!");
    }

    void eat() {
        System.out.println("eating");
    }

    void sleep() {
        System.out.println("sleep");
    }
}