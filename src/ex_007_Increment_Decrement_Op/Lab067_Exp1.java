package ex_007_Increment_Decrement_Op;

public class Lab067_Exp1 {
    public static void main(String[] args) {

        int n = 20;
        System.out.println(n++ + ++n);
        System.out.println(n);

        // A+ B
        // A = n++ , n = 20 then n++ = 20+1 =21
        //+(Assig op)
        // Note : now n = 21
        // B = ++n , 1+21 = 22, here ++n = 22
        //A = 20 AND B = 22

     // formula for understanding
        //int a =10
      // a++ -> A -> ExpA -> 10 , a ->  11
        // +
        // ++a -> B -> ExpB -> 12 , a -> 12
    }
}
