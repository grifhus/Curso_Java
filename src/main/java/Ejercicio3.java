import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       // Guillermo tiene N dolares.Luis tiene la mitad de lo que posee Guillermo.
           //     juan tiene la mitad de lo que posee luis y guillermo juntos.
               // hacer un programa que calcule e imprima la cantidad de dinero que tienen los 3
        Scanner escaner = new Scanner(System.in);
        double dolares;
        System.out.println("Digite la cantidad de dolares que tiene Guillermo: ");
        dolares = escaner.nextDouble();
        double luis = dolares/2;
        double juan = (dolares+luis)/2;
        double total = luis+juan+dolares;
        System.out.println("La cantidad de dolares que tiene Guillermo es: "+dolares);
        System.out.println("La cantidad de dolares que tiene Luis es: "+luis);
        System.out.println("La cantidad de dolares que tiene Juan es: "+juan);
        System.out.println("Los 3 tienen un total de : "+total+" dolares");

    }
}
