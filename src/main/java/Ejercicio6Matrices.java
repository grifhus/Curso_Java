/*
Ejercicio 6: utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda.
 */


import java.util.Scanner;

public class Ejercicio6Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];

        System.out.println("\nIntroduzca los datos de la matriz\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        //Matriz original
        System.out.println("\nMostrando matriz original\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                matriz2[i][j] = matriz1[j][i];
            }
        }

        //matrix transportada
        System.out.println("\nMatriz transportada\n");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
