/*
Ejercicio 8: diseñar una aplicacion que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 numeros. Despues se debe pedir un numero y una posicion,
 insertarlo en la posicion indicada,desplazando los que esten detras.
 */

import java.util.Scanner;


public class Ejercicio8Arreglos {
    public static void main(String[] args) {

        int numeros[] = new int[10], lista[] = new int[10], i_lis = 0, numero, posicion;
        boolean agregado = false;
        Scanner entrada = new Scanner(System.in);

        System.out.println("-=Cargar el arreglo=-");

        for (int i = 0; i < 10; i++) {
            if (i < 8) {
                System.out.print((i + 1) + ".- Escribe un número: ");
            } else if (i == 8) {
                System.out.print("\n- Escribe el número a insertar: ");
            } else {
                System.out.print("- Escribe la posición de inserción: ");
            }
            numeros[i] = entrada.nextInt();
        }

        numero = numeros[numeros.length - 2];
        posicion = numeros[numeros.length - 1];

        while (posicion < 0 || posicion > 10) {
            System.out.print("- Por favor, escribe la posición de inserción dentro del rango 1-10: ");
            posicion = entrada.nextInt();
            if (posicion >= 1 && posicion <= 10) {
                numeros[numeros.length - 1] = posicion;
            }
        }

        lista[numeros.length - 1] = posicion;

        for (int i = 0; i < 8; i++) {
            if (i == posicion - 1 && !agregado) {
                lista[i_lis] = numero;
                i--;
                agregado = !agregado;
            } else {
                lista[i_lis] = numeros[i];
            }
            i_lis++;
        }

        for (int i : lista) {
            System.out.print(i + " ");

        }
    }
}
