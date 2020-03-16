package ir.porteqali.javatutorial.P10_OOP;

public class E044_Scope {

    int a = 0;
    int b = 2;
    String name = " porteqal";


    public E044_Scope() {
        a = b ;
        int c = 10;

        System.out.println(name);

    }


    public void localScope() {
        a = b ;
        int c = b;
        int a = this.a;

        a = b;
    }


    public void anotherLocalScope() {
        a = b ;
        int c = this.b;
    }
}
