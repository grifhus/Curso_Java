/*
        Construir un programa que simule el funcionamiento de una calculadora
        que puede realizar las cuatro operaciones aritmeticas basicas
        (suma,resta,multiplicacion y division) con valores numericos enteros.
        el usuario debe especificar la operacion con el primer caracter del primer
        parametro de la linea de comandos S o s para la suma, R o r para la resta,
        M o m para la multiplicacion y D o d para la divisiion.
*/

import javax.swing.*;

public class Ejercicio11Condicionales {
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, multi, division;
        char operacion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar: ").charAt(0);

        switch (operacion) {
            case 's':
            case 'S':
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                break;
            case 'r':
            case 'R':
                resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'm':
            case 'M':
                multi = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multi);
                break;
            case 'd':
            case 'D':
                division = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "La division es: " + division);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error, Se equivoco de operacion");
        }
    }
}
