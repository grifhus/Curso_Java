import javax.swing.*;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        //int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de Filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de Columnas: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite la matriz: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nCol; j++) {
                System.out.print("Matriz [" + i + "][" + j + "]:  ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < nFilas; i++) {// Numero de filas
            for (int j = 0; j < nCol; j++) {// Numero de columnas
                System.out.print(matriz[i][j]);

            }
            System.out.println("");

        }
    }
}
