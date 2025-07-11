package ex_31_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab239_Generics_List {

    public static void main(String[] args) {
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Varun");
        normalList.add(true);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        //it will not execute String becoz, we have specified <Integer> in line 14

    }
}
