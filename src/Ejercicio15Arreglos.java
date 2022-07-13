import java.util.Scanner;

public class Ejercicio15Arreglos {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        int arreglo[], numero;
        boolean creciente = true;

        arreglo = new int[10];//creamos el arreglo con 10 posiciones

        do {
            //pedimos el arreglo y
            System.out.println("Rellene el arreglo: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + ". Digite un numero: ");
                arreglo[i] = entra.nextInt();
            }
            //Verificar si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i + 1]) {//creciente: 1-2-3..
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {//decreciente: 3-2-1..
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\nEl arreglo esta desordenado,digite nuevamente: \n");
            }
        } while (creciente == false);
        //pedimos el numero a buscar el
        System.out.println("\nDigite el numero a buscar en el arreglo: ");
        numero = entra.nextInt();

        //buscamos el numero en el arreglo
        int i = 0;
        //
        //1-2-3-4-...
        while (i < 10 && arreglo[i] < numero) {
            i++;
        }
        if (i == 10) {  //Hemos recorrido todo el arreglo y no encontramos nada
            System.out.println("\nNumero no encontrado");
        } else {
            if (arreglo[i] == numero) {
                System.out.println("\nNumero encontrado, en la posicion " + i);
            } else {
                System.out.println("\nNumero no encontrado");
            }
        }
    }
}