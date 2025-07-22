package ex_007_Increment_Decrement_Op;

public class Lab069_Decre_P2 {
    public static void main(String[] args) {

        int k = 16;
        int result = --k;
        System.out.println(result); // -- means -1, --k = 15
        System.out.println(k); // 15


        // --k	Pre-decrement	Decremented value	Decremented
        // k--	Post-decrement	Original value	    Decremented
    }
}
