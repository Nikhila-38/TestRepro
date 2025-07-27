package ex_32_CollectionFramework.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab243_AL {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1"); //0
        list.add("2");  //1
        list.add("3");  //2
        list.add("3");  //3
        list.add("4"); //4
        list.add(true);  //5
        list.add("3");  //6


        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));// String
        System.out.println(list.contains(1)); //Integer

        //Returns the index of the first occurence of the specified element


    }
}
