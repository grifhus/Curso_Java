/*
Ejercicio 10: crear un programa que lea por teclado
una tabla de 10 nuemros enteros y desplace n posiciones en el arreglo
( N es digitado por el usuario)
 */

import java.util.Scanner;


public class Ejercicio10Arreglos {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[10];
        int aux, desplaza;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".Ingrese un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        aux = arreglo[9];

        System.out.println("\nIngrese posiciones a dezplazar");
        desplaza = entrada.nextInt();

        for (
                int i = desplaza;
                i > 0; i--) {

            for (int j = 8; j >= 0; j--) {
                arreglo[j + 1] = arreglo[j];

            }
            arreglo[0] = aux;
            aux = arreglo[9];
        }

        System.out.println("\nEl arreglo es: ");
        for (
                int i : arreglo) {
            System.out.print(i + " ");
        }
    }
}

