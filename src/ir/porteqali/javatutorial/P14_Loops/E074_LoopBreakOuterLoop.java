package ir.porteqali.javatutorial.P14_Loops;

public class E074_LoopBreakOuterLoop {

    public E074_LoopBreakOuterLoop() {


        outerLoop:
        for(int i=0 ; i<5; i++) {
            for(int j=0; j<3; j++) {
                if(i==3)continue outerLoop;
                System.out.println(i + " : " + j );
            }
        }
    }
}
