package ex_32_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("Arun");
        arrayList.add(null);
        arrayList.add("Lasya");
        arrayList.add("Lasya"); // Duplicates is allowed
        arrayList.add(123); // Diff data type is allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList();
        l.add("2571155");
        l.add("1214512145");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
