import javax.swing.*;
import java.util.Scanner;
/*
Ejercicio 5: Crear y cargar una amtriz de tamaño N x M, mostrar la suma de cada fila y de cada columna.
 */

public class Ejercicio5Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaColum;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite la matriz");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        //Ahoras procedemos a sumar las filas
        for (int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for (int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("\nLa suma de la fila[" + i + "] es: " + sumaFilas);
        }
        System.out.println("");
        //Por ultimo sumamos las columnas
        for (int j = 0; j < nCol; j++) {
            sumaColum = 0;
            for (int i = 0; i < nFilas; i++) {
                sumaColum += matriz[i][j];
            }
            System.out.println("\nLa suma de la fila[" + j + "] es: " + sumaColum);
        }
        System.out.println("");

    }
}
