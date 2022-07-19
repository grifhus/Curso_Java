/*
Ejercicio 4: crear una amtriz de tamaño 7x7 y
rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0.
 */


public class Ejercicio4Matrices {
    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        for (int i = 0; i < 7; i++) {
            matriz[i][i] = 1;
        }
        System.out.println("\nMatriz\n");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }
}
