package ir.porteqali.javatutorial.P14_Loops;

public class E072_LoopBreak {
    public E072_LoopBreak() {
        for(int i=0 ; i<20 ;i++) {
            if(i%2==0) {
                System.out.println(i);
            }

            if(i==6) break;
        }
    }
}
