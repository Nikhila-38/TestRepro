package ex_17_OOPS;

public class Lab_oops_p2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2;
        new Student();
         // here we are creating 2 Objects, as new student() is displayed 2 times

    }
}
    //we are creating an object
    class Student{  // for every class we have Attributes and Functions
        String name; // This is called Attributes

        Student(){
            System.out.println("Default Constructor"); // This will be displayed if no value is provided
        }

        void sleep(){
            System.out.println("Hi"); // This is called Functions
        }
    }


