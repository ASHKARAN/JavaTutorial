package ir.porteqali.javatutorial.P12_ConditionalStatements;

public class E061_Ternary_Operator {

    public E061_Ternary_Operator() {
        int a = 10 ;
        int b = 20;
        int c = 0 ;
        if(a>10) {
            c = a;
        }
        else {
            c = b;
        }

        int d = a==10 ? a : b;

        System.out.println(d);

    }
}
