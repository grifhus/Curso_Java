//Pedir 10 sueldos.Mostrar su suma y cuantos hay mayores de $1000.

import javax.swing.*;

public class Ejercicio14Ciclos {
    public static void main(String[] args) {

        int sueldo;
        int suma = 0, contSM = 0;

        for (int i = 0; i < 10; i++) {

            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un sueldo"));

            suma = suma + sueldo;

            if (sueldo > 1000) {

                contSM++;
            }
        }

        System.out.println("La suma de todos los sueldos es: " + suma + "$");

        System.out.println("\n Hay " + contSM + " sueldos mayores que 1000$");
    }

}



