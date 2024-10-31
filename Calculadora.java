import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ingresar dos numeros
        System.out.print("Ingrese valor a: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese valor b: ");
        double num2 = scanner.nextDouble();

        //operaciones
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        // division por cero
        double division;
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            division = Double.NaN; //No valido
        }

        // Impresiones
        System.out.println("Resultados:");
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división: " + division);

        // Cerrar el escaner
        scanner.close();
    }
}