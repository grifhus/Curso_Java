import javax.swing.*;

//Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10
public class Ejercicio1Condicionales {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10");
        }
    }
}
