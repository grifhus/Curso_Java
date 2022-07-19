import java.util.Scanner;

public class Ejercicio2Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        System.out.print("Suma de dos matrices cuadradas 3x3.");

        System.out.println("\nMatriz 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un numero en la posicion [" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un numero en la posicion [" + i + "][" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nLa suma de las matrices es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + matriz2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}


