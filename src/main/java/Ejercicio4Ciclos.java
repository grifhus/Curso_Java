import javax.swing.*;

public class Ejercicio4Ciclos {
    public static void main(String[] args) {
        int numero, i = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        while (numero > 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
            i++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "Numero no válido. Ingresó un total de " + i + " numeros.");

    }
}
