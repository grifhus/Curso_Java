import javax.swing.*;

//Hacer un programa que tome dos numero y diga si ambos son pares o impares
public class Ejercicio6Condicionales {
    public static void main(String[] args) {
        int numero, numero2;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));

        if (numero % 2 == 0 & numero2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos numeros son Par");
        } else if (numero % 3 == 0 & numero2 % 3 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos numeros son impar");
        } else if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, numero + " es par.\n" + numero2 + " es impar.");
        } else
            JOptionPane.showMessageDialog(null, numero + " es impar.\n" + numero2 + " es par.");
    }
}

