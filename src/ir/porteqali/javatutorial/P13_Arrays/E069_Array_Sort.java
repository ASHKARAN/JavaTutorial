package ir.porteqali.javatutorial.P13_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class E069_Array_Sort {

    public E069_Array_Sort() {
        Integer [] myArray = {100, 5, 27, 50, 1 , 12};

        printArray(myArray);
        System.out.println("--------------------------");
        Arrays.sort(myArray, Collections.reverseOrder());
        printArray(myArray);
    }

    private void printArray(Integer [] myArray) {

        System.out.println("0: " + myArray[0]);
        System.out.println("1: " + myArray[1]);
        System.out.println("2: " + myArray[2]);
        System.out.println("3: " + myArray[3]);
        System.out.println("4: " + myArray[4]);
        System.out.println("5: " + myArray[5]);
    }
}
