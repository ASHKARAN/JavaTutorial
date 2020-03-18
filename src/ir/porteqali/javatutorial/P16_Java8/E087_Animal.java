package ir.porteqali.javatutorial.P16_Java8;

public class E087_Animal implements E087_Dog, E087_Cat{

    @Override
    public void Sound() {
        E087_Dog.super.Sound();
        E087_Cat.super.Sound();
        System.out.println("its my sound");
        E087_Cat.Walk();
    }
}
