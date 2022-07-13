/*
Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
*/

import java.util.Scanner;

public class Ejercicio14Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo1[] = new int[10];
        int arreglo2[] = new int[10];
        int arreglo3[] = new int[20];
        boolean creciente = true;

        System.out.println("Datos del primer arreglo");
        //Llenado del primer arreglo arreglo
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                arreglo1[i] = entrada.nextInt();
            }
            //Comprobar si el arreglo esta de forma creciente
            for (int i = 0; i < 9; i++) {
                if (arreglo1[i] < arreglo1[i + 1]) {//Ordenado de forma creciente 1-2-3...
                    creciente = true;
                }
                if (arreglo1[i] > arreglo1[i + 1]) {//Ordenado de forma decreciente 3-2-1...
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("El arreglo no esta en forma creciente, digite de nuevo los números");
            }
        } while (creciente == false);

        //Llenando el segundo arreglo
        System.out.println("\nDatos del segundo arreglo");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Digite un numero: ");
                arreglo2[i] = entrada.nextInt();
            }
            //Comprobamos que este de forma creciente
            for (int i = 0; i < 9; i++) {
                if (arreglo2[i] < arreglo2[i + 1]) {
                    creciente = true;
                }
                if (arreglo2[i] > arreglo2[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("El arreglo no esta en forma creciente, digite de nuevo los números");
            }
        } while (creciente == false);

        //Se realiza el tercer arreglo combinando el arreglo1 y arreglo2
        //Se crean iteradores
        int a = 0, b = 0, c = 0;

        while (a < 10 && b < 10) { //Cuando A se menor a 10 y ademas B menor a 10
            if (arreglo1[a] < arreglo2[b]) { //Cuando arreglo1 sea menor que arreglo2
                arreglo3[c] = arreglo1[a];
                a++;//para la siguiente posición de A
                c++;//para la siguiente posición de C
            } else {//Cuando arreglo2 sea menor que arreglo1
                arreglo3[c] = arreglo2[b];
                b++;//para la siguiente posición de B
                c++;//para la siguiente posición de C
            }
        }
        //resto de arreglo1 y arreglo2
        if (a == 10) { //si A es igual a 10
            while (b < 10) {
                arreglo3[c] = arreglo2[b];
                b++;
                c++;
            }
        } else {
            while (a < 10) {
                arreglo3[c] = arreglo1[a];
                a++;
                c++;
            }
        }

        //Tercer arreglo
        System.out.println("\nEl tercer arreglo queda de la siguiente forma:");
        for (int i = 0; i < 20; i++) {
            System.out.print(arreglo3[i] + " - ");
        }
        System.out.println();
    }

}

