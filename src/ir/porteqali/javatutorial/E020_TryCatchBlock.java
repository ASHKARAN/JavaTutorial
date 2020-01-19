package ir.porteqali.javatutorial;

public class E020_TryCatchBlock {


    public void Start() {

        String porteqal = "ali";




        try {
           // int a = Integer.parseInt(porteqal);
            float b = Float.parseFloat(porteqal);
            System.out.println(b);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }

        System.out.println(porteqal);


    }
}
