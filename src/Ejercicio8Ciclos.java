//Pedir un numero B, y mostrar todos los numeros del 1 al N.

import javax.swing.*;

public class Ejercicio8Ciclos {
    public static void main(String[] args) {
        int numero, total;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero N: "));
        JOptionPane.showMessageDialog(null, "Los numeros del 1 al N son: ");

        for (int i = 1; i <= numero; i++) {

            JOptionPane.showMessageDialog(null, +i);

        }

    }
}

