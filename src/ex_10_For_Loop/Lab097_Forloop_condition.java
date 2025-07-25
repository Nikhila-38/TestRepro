package ex_10_For_Loop;

public class Lab097_Forloop_condition {
    public static void main(String[] args) {
        int i = 10;
        for (; i > 0;i--){
            System.out.println(i);
            // 10> 0 : True
            // 10>9 : True, so on till 1
            // 10,9,8,7,6,5,4,3,2,1 will be displayed

        }
    }
}
