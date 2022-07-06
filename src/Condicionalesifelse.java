import javax.swing.*;

public class Condicionalesifelse {
    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (numero > dato) {
            JOptionPane.showMessageDialog(null, "El numero es Mayor a 5");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es 5 o Menor a 5");
        }
    }
}
