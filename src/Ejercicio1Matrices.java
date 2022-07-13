import javax.swing.*;
import java.util.Scanner;

public class Ejercicio1Matrices {
    public static void main(String[] args) {
        //int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol;
        boolean simetrica = true;

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
        if (nFilas == nCol) {// Si el numero de filas es igual al numero de columnas
            int i, j;
            i = 0;
            while (i < nFilas && simetrica == true) {
                j = 0;
                while (j < nCol && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            } else {
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }

        } else {
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
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
