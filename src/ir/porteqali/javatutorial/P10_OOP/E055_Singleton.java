package ir.porteqali.javatutorial.P10_OOP;

public class E055_Singleton {


    public E055_Singleton() {
        E055_SingletonExample a = E055_SingletonExample.getInstance() ;
        E055_SingletonExample b = E055_SingletonExample.getInstance() ;
        E055_SingletonExample c = E055_SingletonExample.getInstance() ;
        E055_SingletonExample d = E055_SingletonExample.getInstance() ;

        System.out.println(a.text);
        System.out.println(b.text);
        System.out.println(c.text);


        d.text = "text from outside";

        System.out.println(a.text);
        System.out.println(b.text);
        System.out.println(c.text);



    }
}
