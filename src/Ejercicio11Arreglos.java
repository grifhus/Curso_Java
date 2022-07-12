/*
Leer 5 elementos numericos que se introduciran ordenados de forma creciente.
 Estos los guardaremos en una tabla de tamaño 10.
  Leer un numero N , e insertarlo en el lugar adecuado para que la tabla continue ordenada.
 */

import java.util.Scanner;

public class Ejercicio11Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitio_num = 0, j = 0;

        System.out.println("LLenar el arreglo");
        do {
            //LLenando el arreglo
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Digite el numero: ");
                arreglo[i] = entrada.nextInt();
            }
            //Comprobar si el arreglo esta ordenado en orden creciente
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) {// Creciente: 1234
                    creciente = true;

                }
                if (arreglo[i] > arreglo[i + 1]) {//decreciente : 4321
                    creciente = false;
                    break;

                }
            }
            if (creciente == false) {
                System.out.println("El arreglo no esta ordenado  en forma creciente, vuelva a digitar: \n");
            }
        } while (creciente == false);

        System.out.print("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();

        //Esto es para darnos cuenta en que posicion vamos a introducir el numero

        while (arreglo[j] < numero && j < 5) {
            sitio_num++;
            j++;
        }
        //Por ultimo trasladamos la posicion en el arreglo a los elementos que van detras del nuemro
        for (int i = 4; i >= sitio_num; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        //insertamos el numero que el usuario puso
        arreglo[sitio_num] = numero;
        System.out.println("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(arreglo[i] + " - ");
        }

    }
}
