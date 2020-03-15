package ir.porteqali.javatutorial.P08_Classes;

public class E031_StaticUsage {


    public void Start() {
        E030_Instance_Example object =
                new E030_Instance_Example();

        object.print();
        String name = E030_Instance_Example.name;
        System.out.println(name);
    }
}
