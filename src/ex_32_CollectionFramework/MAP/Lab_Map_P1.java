package ex_32_CollectionFramework.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_Map_P1 {
    public static void main(String[] args) {

        //Map M1 = new Map(); not allowed

        Map m1 = new HashMap(20); // Doesn't maintain keys values in order
        m1.put("name","piya");// Map is key and value pair
        m1.put("rollno", 3);    // name --> Piya
        m1.put("Mobile", 154214574);  // No duplicates values are allowed
        System.out.println(m1);

        Map m2 = new LinkedHashMap();// Maintain keys values in order
        m2.put("name", "priya");
        m2.put("rollno", 3);
        m2.put("Mobile", 154214574);
        System.out.println(m2);

        Map m3 = new TreeMap(); // follows the given structure
        m3.put("Firstname","Riya");
        m3.put("Lastname","Raj");
        m3.put("rollno",3);
        m3.put("Mobile", 154214574);
        System.out.println(m3);

    }
}