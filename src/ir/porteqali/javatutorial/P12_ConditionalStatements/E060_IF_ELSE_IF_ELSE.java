package ir.porteqali.javatutorial.P12_ConditionalStatements;

public class E060_IF_ELSE_IF_ELSE {

    public E060_IF_ELSE_IF_ELSE() {
        int a = 10;
        int b = 20;
        int c = 12;

        if(a>11) {
            System.out.println(1);
        }
        else if(b<15) {
            System.out.println(2);
        }
        else if(c < 14) {
            System.out.println(3);
        }
        else if(a>c){
            System.out.println(4);
        }
        else if(c == 15) {
            System.out.println(5);
        }
        //.....
    }
}
