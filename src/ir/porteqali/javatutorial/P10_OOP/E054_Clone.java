package ir.porteqali.javatutorial.P10_OOP;

public class E054_Clone {

    public E054_Clone() {
        E054_Student student1 = new E054_Student("ali" , 20);
        student1.name = "ali";

        System.out.println("student1: " + student1.name);


        E054_Student student2 = null;
        try {
            student2 = (E054_Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        student2.name = "mamad";
        System.out.println("student2: " + student2.name);
        System.out.println("student1: " + student1.name);

    }
}
