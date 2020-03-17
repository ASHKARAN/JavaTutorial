package ir.porteqali.javatutorial.P12_ConditionalStatements;

import ir.porteqali.javatutorial.P10_OOP.E053_Colors;

public class E064_Switch_Break {

    public E064_Switch_Break() {
        E053_Colors color = E053_Colors.GREEN;


        switch (color) {
            case BLUE:  System.out.println(E053_Colors.BLUE);   break;
            case BLACK: System.out.println(E053_Colors.BLACK);  break;
            case RED:   System.out.println(E053_Colors.RED);    break;
            case GREEN: System.out.println(E053_Colors.GREEN);  break;
            case WHITE: System.out.println(E053_Colors.WHITE);  break;
        }
    }
}
