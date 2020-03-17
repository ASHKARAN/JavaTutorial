package ir.porteqali.javatutorial.P14_Loops;

public class E073_LoopContinue {

    public E073_LoopContinue() {
        for(int i=0 ; i<20 ;i++) {
            if(i>5 && i<10) {
                continue;
            }
            if(i%2==0)
                System.out.println(i);

        }
    }
}
