package ir.porteqali.javatutorial.P11_SimpleProject;

import java.util.Scanner;

public class E057_SimpleProject {

    int a ;
    int b ;
    String operator;
    Scanner scanner ;
    public E057_SimpleProject() {
        System.out.println("Welcome to my great calculator!!!!!");
        this.scanner = new Scanner(System.in);
        start();
    }

    private void start() {
        System.out.println("Please enter the first number");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter the operator");
        operator =  scanner.nextLine() ;

        System.out.println("Please enter the second number");
        b = Integer.parseInt(scanner.nextLine());
        
        E057_Calculator calculator = new E057_Calculator();
        int response   ;
        switch (operator) {
            case "+" : {
                response = calculator.sum(a, b);
                break;
            }
            case "-" : {
                response = calculator.minus(a, b);
                break;
            }
            case "*" : {
                response = calculator.mult(a, b);
                break;
            }
            case "/" : {
                response = calculator.div(a, b);
                break;
            }
            default:
                response = -1;
        }

        System.out.println(response);
    }


}
