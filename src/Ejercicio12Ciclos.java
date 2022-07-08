import java.util.Scanner;

public class Ejercicio12Ciclos {
    public static void main(String[] args) {
        System.out.println("Escriba un número al cual le sacaremos su factorial: ");
        Scanner entrada = new Scanner(System.in);
        int dato =  entrada.nextInt();
        int factorial=1;

        for (int i= 1; i<=dato; i++)
        {
            factorial *= i;
        }
        System.out.println("El factorial es: " + factorial);
    }
}
