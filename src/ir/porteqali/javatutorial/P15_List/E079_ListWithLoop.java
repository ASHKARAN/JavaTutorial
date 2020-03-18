package ir.porteqali.javatutorial.P15_List;

import java.util.ArrayList;
import java.util.List;

public class E079_ListWithLoop {

    public E079_ListWithLoop() {


        List<String> name = new ArrayList<>();
        name.add("ali");
        name.add("mamad");
        name.add("saeed");
        name.add("reza");

        for(String item : name) {
            System.out.println(item);
        }
    }
}
