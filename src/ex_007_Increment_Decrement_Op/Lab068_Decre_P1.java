package ex_007_Increment_Decrement_Op;

public class Lab068_Decre_P1 {
    public static void main(String[] args) {

        int l = 23;
        int result_post = l--;

        System.out.println(result_post); // 23 (original value)
        System.out.println(l); // l-- : 23-1 = 22


        // --k	Pre-decrement	Decremented value	Decremented
        // k--	Post-decrement	Original value	    Decremented
    }
}
