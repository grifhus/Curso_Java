import javax.swing.*;

public class Ejercicio1Ciclos {
    public static void main(String[] args) {
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero >= 0) {
            cuadrado = (int)Math.pow(numero,2);

            JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cruadrado es: "+cuadrado);

            numero=Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));


        }

    }
}
