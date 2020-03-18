package ir.porteqali.javatutorial.P15_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E081_LinkedList {


    public E081_LinkedList() {
        List<String> list = new ArrayList<>();
        list.add("ali");
        list.add("mamad");
        list.add("reza");
        list.add("ray");

        for(String name : list)
            System.out.println(name);
        System.out.println("-----------------");


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("ali");
        linkedList.add("mamad");
        linkedList.add("reza");
        linkedList.add("ray");

        linkedList.pop();
        for(String name : linkedList)
            System.out.println(name);
    }
}
