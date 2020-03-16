package ir.porteqali.javatutorial.P10_OOP;

public class E054_Clone {

    public E054_Clone() {
        E054_Student student = new E054_Student();
        student.age = 15 ;
        student.name = "ali";

        System.out.println(student .name);


        E054_Student student2 = null;
        try {
            student2 = (E054_Student) student.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        student.name = "reza";

        student2.age = 20 ;
        student2.name = "mamad";
        System.out.println(student2.name);
    }
}
