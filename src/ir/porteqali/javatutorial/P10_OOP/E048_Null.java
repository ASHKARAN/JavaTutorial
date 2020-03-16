package ir.porteqali.javatutorial.P10_OOP;

import ir.porteqali.javatutorial.P08_Classes.E033_Husky;

public class E048_Null {
    //NullPointerException

    public E048_Null() {
        E033_Husky husky = new E033_Husky();
        whereIsMyHusky(null);
    }


    private void whereIsMyHusky(E033_Husky husky) {
       husky.Sound() ;
    }
}
