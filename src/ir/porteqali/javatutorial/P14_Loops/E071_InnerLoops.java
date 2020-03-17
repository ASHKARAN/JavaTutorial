package ir.porteqali.javatutorial.P14_Loops;

public class E071_InnerLoops {
    public E071_InnerLoops() {

        for(int i=0; i<3; i++) {
            System.out.println("i: " + i);
            for(int j=0 ; j<3; j++) {
                System.out.println("j: " + j);
                for(int k=0 ; k<5; k++)
                    System.out.println("k: " + k);
            }
        }
    }
}
