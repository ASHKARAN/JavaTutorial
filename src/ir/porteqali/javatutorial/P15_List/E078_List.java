package ir.porteqali.javatutorial.P15_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E078_List {


    public E078_List() {
        Integer [] array = {2,3,4};
        System.out.println(array.length);
        System.out.println(array[1]);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        list.addAll(Arrays.asList(array));
        list.set(2, 15);
        System.out.println(list.contains(25));

        System.out.println(list.size());
        System.out.println(list.get(2));

    }
}
