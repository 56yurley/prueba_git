import java.util.Scanner;

public class Main {
    private static int num1 = 0;
    private static int num2 = 0;
    private static Scanner entradaEscaner = new Scanner (System.in);
    private static Sume sume = new Sume();
    private static Rest rest = new Rest();


    public static void main(String[] args) {
       ControllerCalculator controllerCalculator = new ControllerCalculator();
        loadDates();
    }

    private static void loadDates(){
        System.out.println("Ingresa el primer número");
        num1 = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println("Ingresa el segundo número");
        num2 = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println("---------------------------");
        System.out.println("The sume is: " + sume.operation(num1, num2));
        System.out.println("The rest is: " + rest.operation(num1, num2));

    }
}
