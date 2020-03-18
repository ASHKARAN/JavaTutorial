package ir.porteqali.javatutorial.P16_Java8;

public interface E087_Cat {

    default void Sound() {
        System.out.println("Mewwww Mewwww ");
    }

    static void Walk() {
        System.out.println("Walking");
    }
}
