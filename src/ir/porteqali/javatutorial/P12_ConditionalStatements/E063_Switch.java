package ir.porteqali.javatutorial.P12_ConditionalStatements;

public class E063_Switch {


    public E063_Switch() {
        int a = 4;

        if(a == 5) {

        }
        else if(a == 6) {

        }
        else if(a == 7) {

        }
        else if(a ==8) {

        }


        switch (a) {
            case 1:  System.out.println(1);
            case 2:  System.out.println(2);
            case 3:  System.out.println(3);
            case 4:
            case 5:
            case 6:  {
                System.out.println("4-5-6");
            }
            case 10:  System.out.println(10);
        }
    }
}
