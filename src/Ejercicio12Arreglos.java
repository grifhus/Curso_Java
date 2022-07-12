import java.util.Scanner;
/*
Leer por teclado una tabla de 10 elementos numericos enteros y una posicion (entre 0 y 9).
Eliminar el elemento situado en la posicion dada sin dejar huecos
 */
public class Ejercicio12Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] tabla = new int[10];
        int posicion;

        //Ingresar los números por medio de la consola.
        System.out.println("INGRESE NÚMEROS DE LA TABLA");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " +i+ ": ");
            tabla[i] = entrada.nextInt();
        }

        //Solicitar una posición y comprobar que está entre 0-9.
        do {
            System.out.print("\nDigite una posición entre 0-9: ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion > 10);

        //Colocar cero la posición que se digito.
        tabla[posicion] = 0;

        //Recorrer todos los números de la tabla para no dejar huecos.
        for (int i = posicion; i < 9; i++) {
            tabla[i] = tabla[i+1];
        }

        //Poner en cero la último posición.
        tabla[9] = 0;

        System.out.println("\nNUEVA TABLA");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " +i+ ": " +tabla[i]);
        }
    }
}

