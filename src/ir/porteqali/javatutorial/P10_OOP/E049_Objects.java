package ir.porteqali.javatutorial.P10_OOP;

import ir.porteqali.javatutorial.P08_Classes.E033_Animal;
import ir.porteqali.javatutorial.P08_Classes.E033_Husky;

public class E049_Objects {

    public E049_Objects() {
        E033_Animal animal = new E033_Animal();
        E033_Husky husky = new E033_Husky();
        animal = husky;

        Object object = animal;
    }
}
