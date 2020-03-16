package ir.porteqali.javatutorial.P10_OOP;

import ir.porteqali.javatutorial.P08_Classes.E033_Husky;

public class E042_This {

    public E042_This() {
        E033_Husky husky = new E033_Husky();
        husky.Sound();

        E042_This.this.print();

    }


    public void print() {
        System.out.println("print");
    }

    public static void test() {

    }
}
