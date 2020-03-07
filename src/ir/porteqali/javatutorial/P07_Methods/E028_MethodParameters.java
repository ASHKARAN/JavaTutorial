package ir.porteqali.javatutorial.P07_Methods;

public class E028_MethodParameters {


    public void Start() {
        int x = 2;
        int y = 10;
        int c = sum(x,y );
        System.out.println(c);
        System.out.println(minus(10,5));
        System.out.println(multiple(10,5));
        System.out.println(div(10,5));
    }


     public int sum(int a, int b) {
        return  a+b;
     }
     public int sum() {
        return  0;
     }




     public int minus(int a, int b) {
        return  a-b;
     }
     public int multiple(int a, int b) {
        return  a*b;
     }
     public int div(int a, int b) {
        return  a/b;
     }
}
