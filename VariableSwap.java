import java.util.Scanner;

public class VariableSwap {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ingresar dos numeros
        System.out.print("Ingrese valor a: ");
        double x = scanner.nextDouble();

        System.out.print("Ingrese valor b: ");
        double y = scanner.nextDouble();

        System.out.println("Valores iniciales: x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Valores intercambiados: x = " + x + ", y = " + y);
    }
}