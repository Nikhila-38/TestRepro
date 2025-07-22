package ex_17_OOPS;

public class Lab168_cat {
    public static void main(String[] args) {

        Cat c1 = new Cat(); // new means new object is created
        new Cat(); // new means new object is created
        Cat c2; // new object is not created

        c1.running();// we can have functions. because object is created
        // c2 .running(); is not allowed
        new Cat().running(); // we can have functions. because object is created

        }
    }

    class Cat{
        String name;

        void running(){
            System.out.println("Running");
        }

    }

