package ex_02_JavaBasics;

public class Example_LV {
    public static void main(String[] args) {

        int p = 12;
        {
            int b = 40;
           System.out.println(b);// this is the another block of LV, here if we print then we get output as 40
            // here if we don't have sysout, then output will not be displayed

        }
           int b = 10;
        System.out.println(b); // Local variables of mainmethod, here if we print then we get output as 10
         // if we have sysout only here, then 10 will be displayed as output
    }
}
