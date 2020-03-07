package ir.porteqali.javatutorial.P07_Methods;

public class E027_MethodDataTypes {


    public void Start() {
        String a = "ali";
        int b = 123;

        int c = sum();
        System.out.println(c);

        String hi = hi();
        System.out.println(hi + " Ali");

    }


    public void doSomething() {

    }



    public int sum() {
        int b = 3 + 67;
        return  b;
    }


    public String hi() {
        return  "Hello";
    }
}
