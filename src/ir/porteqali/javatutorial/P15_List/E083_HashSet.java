package ir.porteqali.javatutorial.P15_List;

import java.util.HashMap;
import java.util.HashSet;

public class E083_HashSet {

    public E083_HashSet() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1 , "ashkaran");
        hashMap.put(20 , "parvanlo");
        hashMap.put(3 , "mamadi");
        hashMap.put(5 , "mamadi");

        System.out.println(hashMap );

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ali");
        hashSet.add("mamad");
        hashSet.add("reza");
        hashSet.add("reza");

        for(String name : hashSet)
        System.out.println(name);
    }
}
