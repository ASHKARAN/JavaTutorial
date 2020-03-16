package ir.porteqali.javatutorial.P10_OOP;

public class E050_Encapsulation {

    public E050_Encapsulation() {
        E050_Model model = new E050_Model();
        model.setAge(20);
        model.setFname("ali");
        model.setLname("ashkaran");

        System.out.println(model.getAdmin());
    }
}
