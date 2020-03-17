package ir.porteqali.javatutorial.P12_ConditionalStatements;

import ir.porteqali.javatutorial.P10_OOP.E053_Colors;

public class E065_Switch_Default {

    public E065_Switch_Default() {
        E053_Colors color = E053_Colors.WHITE;

        switch (color) {
            case BLUE:  System.out.println(E053_Colors.BLUE);   break;
            case BLACK: System.out.println(E053_Colors.BLACK);  break;
            case RED:   System.out.println(E053_Colors.RED);    break;
            default:    System.out.println("NOT FOUND");
        }
    }
}
