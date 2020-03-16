package ir.porteqali.javatutorial.P10_OOP;

public class E055_SingletonExample {

    private static E055_SingletonExample instance ;

    public String text ;

    public E055_SingletonExample() {
        text = "Hello, i'm a singleton";
    }

    public static E055_SingletonExample getInstance() {
        if(instance == null)
            instance = new E055_SingletonExample();
        return instance;
    }
}
