package ir.porteqali.javatutorial.P15_List;

import ir.porteqali.javatutorial.P10_OOP.E054_Student;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class E080_ListIterator {

    public E080_ListIterator() {
        List<E054_Student> studentList = new ArrayList<>();

        studentList.add(new E054_Student("ali" , 30));
        studentList.add(new E054_Student("porteghal" , 2));
        studentList.add(new E054_Student("saeed" , 215));
        studentList.add(new E054_Student("sib" , 50));


        ListIterator<E054_Student> listIterator = studentList.listIterator();

        while(listIterator.hasNext()) {
            E054_Student student = listIterator.next();
            System.out.println(student.getName());
        }


    }
}
