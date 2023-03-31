// Daniel Zanon Lopez

package gradleEDD;

import org.apache.commons.math3.primes.Primes;

public class App {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Debe ingresar dos números como argumentos.");
            return;
        }

        // Convertir los argumentos a números
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Realizar las operaciones matemáticas
        int suma = num1 + num2;
        int resta = num1 - num2;
        int division = num1 / num2;
        int multiplicacion = num1 * num2;

        // Imprimir los resultados
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La división es: " + division);
        System.out.println("La multiplicación es: " + multiplicacion);
        if (Primes.isPrime(num1)) {
            System.out.println("El número " + num1 + " és primo");
        } else {
            System.out.println("El número " + num1 + " no és primo");
        }
        System.out.println("El siguiente primo de "+num1+" es " + Primes.nextPrime(num1));
    }
}
