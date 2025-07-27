package ex_12_Do_While_Loop;

public class Lab111_Do_While_P1 {
    public static void main(String[] args) {

        int h = 1;
        do {  // first it will print the stmt and later it checks the condition
            System.out.println("Executed this line atleast once!");
            System.out.println(h);
            h++; // Here value will be incremented to h =1 and ++ =1 ,then h value is 2
        }
        while (h < 10); // this is the condition, 2<10 : T
        }
    }
