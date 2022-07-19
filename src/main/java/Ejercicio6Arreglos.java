/*
Ejercicio 6: Leer los datos correspondiente a dos tablas de 12 elementos numeros,
 y mezclarlos en una tercera de la forma 3 de la tabla A ,
  3 de la tabla B , otros 3 de A otros 3 de la B , etc.
 */


import java.util.Scanner;

public class Ejercicio6Arreglos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] tabla1 = new int[12];
        int[] tabla2 = new int[12];
        int[] tabla3 = new int[24];

        System.out.println("Creando la tabla 1 ");
        for (int i = 0; i < tabla1.length; i++) {
            System.out.print("Ingrese un numero: ");
            tabla1[i] = input.nextInt();
        }

        System.out.println("\nCreando la tabla 2 ");
        for (int i = 0; i < tabla2.length; i++) {
            System.out.print("Ingrese un numero: ");
            tabla2[i] = input.nextInt();
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < tabla3.length) {

            for (int cont = 0; cont < 3; cont++) {
                tabla3[i] = tabla1[j];
                i++;
                j++;
            }


            for (int cont = 0; cont < 3; cont++) {
                tabla3[i] = tabla2[k];
                i++;
                k++;
            }
        }

        System.out.println("\nmostrando la tabla 3");
        for (i = 0; i < tabla3.length; i++) {
            System.out.print(tabla3[i] + " - ");
        }
    }
}