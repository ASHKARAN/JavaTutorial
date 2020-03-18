package ir.porteqali.javatutorial.P16_Java8;

import java.util.ArrayList;
import java.util.List;

public class E086_MethodReference {

    public E086_MethodReference() {
        List<String> list = new ArrayList<>();
        list.add("param1");
        list.add("param2");
        list.add("param3");
        list.add("param4");
        list.add("param5");
        list.add("param6");


        for(String param : list) {
            System.out.println(param);
        }

        System.out.println("----------------");

        list.forEach(System.out::println);
    }
}
