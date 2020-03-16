package ir.porteqali.javatutorial.P10_OOP;

public class E054_Student implements Cloneable {

    int age ;
    String name ;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
