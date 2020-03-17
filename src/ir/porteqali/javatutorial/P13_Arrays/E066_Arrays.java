package ir.porteqali.javatutorial.P13_Arrays;

public class E066_Arrays {

    public E066_Arrays() {
        int a = 10;
        int b = 15;
        int c = 18;
        int d = 20;

        float sum = (a+b+c+d)/4;
        System.out.println(sum);

        int [] array = new int[4];

        array[0] = 5 ;
        array[2] = 10 ;
        array[3] = 4 ;

        System.out.println(array[1]);

        String [] names = new String[4];
        names[0]  ="ali";
        names[1] = "10";
        names[2] = "porteqal";
        names[3] = "golabi";

        System.out.println(names[2]);

        /*
        -----------------------------
        |  5 |  0 | 10 | 4  |    |     |
        -----------------------------

         */





    }
}
