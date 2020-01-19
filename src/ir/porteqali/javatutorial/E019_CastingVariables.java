package ir.porteqali.javatutorial;

public class E019_CastingVariables {

    public void Start() {
        int porteqal = 10;
        float sib = 15.3f;
        String angoor = "16";

        float a = 15.4f;
        double d = 5.33;



        porteqal =  Integer.parseInt(angoor);
        a = Float.parseFloat(angoor);
        d = Double.parseDouble(angoor);

        System.out.println(d);
    }
}
