/*
Leer 10 enteros en una tabla. Guardar en otra tabla los elementos apres de la priemra.
 y a continuacion los elementos impares.
 */

import java.util.Scanner;

public class Ejercicio13Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];//creamos el arreglo para 10 elementos enters
        int conteo_pares = 0, conteo_impares = 0;


        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();


            if (arreglo[i] % 2 == 0) {//Si el numero es par
                conteo_pares++;
            } else {// Si el numero es impar
                conteo_impares++;
            }
        }
// Crear los arreglos siguientes
        int par[] = new int[conteo_pares];  // Creamos arreglo para almacenarlos numeros pares
        int impar[] = new int[conteo_impares];// Creamos arreglo para almacenarlos numeros impares

        conteo_pares = 0;
        conteo_impares = 0;
// almacenamos los numeros pares en su arreglo y los impares tambien
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {// Si el numero es par
                par[conteo_pares] = arreglo[i];
                conteo_pares++;

            } else {//Si el numero es impar
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;

            }

        }
        System.out.print("\nArreglo pares: ");
        for (int i = 0; i < conteo_pares; i++) {
            System.out.print(par[i] + " - ");

        }
        System.out.print("\nArreglo impares: ");
        for (int i = 0; i < conteo_impares; i++) {
            System.out.print(impar[i] + " - ");
        }
    }
}
