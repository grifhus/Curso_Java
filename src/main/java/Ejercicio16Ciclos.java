import javax.swing.*;

public class Ejercicio16Ciclos {
    public static void main(String[] args) {
        int numero, tabla = 0, multi = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 0 a 10"));

        while (numero <= 0 || numero > 10) {
            JOptionPane.showMessageDialog(null, "Fuera de Rango, vuelva a escribir un número del 0 al 10");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 0 a 10"));
        }

        System.out.println("La Tabla de Multiplicar de " + numero + " es \n");

        for (int i = 0; i <= 10; i++) {

            tabla = numero * multi;
            multi++;
            System.out.println(numero + " x " + i + " = " + tabla);
        }
    }
}


