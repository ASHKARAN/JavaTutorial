package ir.porteqali.javatutorial.P15_List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class E082_HashMap {

    public E082_HashMap() {
        List<String> list = new ArrayList<>();

        list.add("ali");
        list.add("mamad");
        list.add("reza");

        list.get(0);


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1 , "ashkaran");
        hashMap.put(20 , "parvanlo");
        hashMap.put(3 , "mamadi");

        System.out.println(hashMap.get(20));

    }
}
