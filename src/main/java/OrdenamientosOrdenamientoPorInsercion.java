import javax.swing.*;
import java.util.Scanner;
/*
Que es el ordenamiento por insercion?
Es una manera muy natural de ordenar para un ser humano,
y puede usarse facilmente para ordenar un mazo de cartas numeradas en forma arbitraria.
Requiere 0(n2)operaciones para ordenar una lista de n elementos
 */

public class OrdenamientosOrdenamientoPorInsercion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nelementos, pos, aux;

        nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elmentos del arreglo: "));
        arreglo = new int[nelementos];

        System.out.println("Rellene el arreglo: ");
        for (int i = 0; i < nelementos; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        // Ordenamiento por insercion //
        for (int i = 0; i < nelementos; i++) {
            pos = i;
            aux = arreglo[i];

            while ((pos > 0) && (arreglo[pos - 1] > aux)) {
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.println("Orden ascendente: ");
        for (int i = 0; i < nelementos; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println("\nOrden descendente: ");
        for (int i = (nelementos - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " - ");
        }

    }
}
