package ir.porteqali.javatutorial.P14_Loops;

public class E075_WhileLoop {

    public E075_WhileLoop() {

        Boolean condition = true;
        for(int i=0 ; i<5; i++) {
            System.out.println(i);
        }


        int counter = 0;
        while(condition) {
            System.out.println("while is running: " + counter);
            counter++;

            condition = counter>10 ;
        }
    }
}
