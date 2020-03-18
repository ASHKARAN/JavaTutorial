package ir.porteqali.javatutorial.P15_List;

import java.util.Hashtable;
import java.util.Map;

public class E084_HashTable {

    public E084_HashTable() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("fname", "porteqal");
        hashtable.put("lname", "sib");

        for(Map.Entry entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
