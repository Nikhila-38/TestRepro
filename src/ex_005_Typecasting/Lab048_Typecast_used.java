package ex_005_Typecasting;

public class Lab048_Typecast_used {
    public static void main(String[] args) {

        int Group = 200;
        float GST =  18.45f;

        int total1 = Group+(int) GST; //Explicit
        System.out.println(total1);

        float total2 = Group+GST;
        float total3 = (float) Group+GST;

        System.out.println(total2); // widening implicit
        System.out.println(total3);// widening explicit

    }
}
