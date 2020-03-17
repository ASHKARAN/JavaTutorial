package ir.porteqali.javatutorial.P14_Loops;

public class E076_doWhile {

    public E076_doWhile() {
        int counter = 0;



        while(counter<10) {
            System.out.println(counter++);
        }


        do {
            System.out.println(counter++);
        }
        while(counter<20);
    }
}
