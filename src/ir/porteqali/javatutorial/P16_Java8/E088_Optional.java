package ir.porteqali.javatutorial.P16_Java8;

import java.util.Optional;

public class E088_Optional {

    public E088_Optional() {

        Optional<Integer> a = Optional.of(10);
        Optional<Integer> b = Optional.empty();
        System.out.println(sum(a,b));

    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {

        System.out.println("a : " + a.isPresent());
        System.out.println("b : " + b.isPresent());
        Integer aValue = a.orElse(0);
        Integer bValue = b.orElse(0);

        return aValue + bValue;


    }
}
