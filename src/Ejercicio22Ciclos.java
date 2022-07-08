import javax.swing.*;
//pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso.
public class Ejercicio22Ciclos {

    public static void main(String[] args) {
        float nota;
        int cont = 0;
        boolean suspenso = false;

        for (int i = 1; i <= 5; i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la " + i + "º calificacion: "));
            } while ((nota < 0) || (nota > 10));

            if (nota < 4) {
                suspenso = true;
                cont++;
            }
        }
        if (suspenso == true) {
            System.out.println("Hay " + cont + " alumnos suspensos.");
        } else {
            System.out.println("No hay alumnos suspensos.");
        }
    }
}

