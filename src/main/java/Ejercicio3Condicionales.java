import javax.swing.*;

//Hacer un programa que lea un caracter por teclado y compruebe si es una letra mayuscula
public class Ejercicio3Condicionales {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es una letra Mayuscula");
        }
        else {
            JOptionPane.showMessageDialog(null,"Es una letra Minuscula");
        }

    }
}
