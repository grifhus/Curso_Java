import javax.swing.*;

public class Ejercicio12Condicionales {
    public static void main(String[] args) {


        // Variables
        int calificacion;
        String observacion;

        // Solicitudes input
        calificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite la calificación de 0 a 10:"));

        // Proceso
        if ((calificacion > 0) && (calificacion < 11)) {
            switch (calificacion) {
                case 10:
                    observacion = "Sobresaliente";
                    break;
                case 9:
                    observacion = "Notable";
                    break;
                case 8:
                    observacion = "Bien";
                    break;
                case 7:
                    observacion = "Suficiente";
                    break;
                default:
                    observacion = "Insuficiente";
                    break;
            }

            // Impresión
            JOptionPane.showMessageDialog(null, observacion);

        } else {
            JOptionPane.showMessageDialog(null, "La calificación es inválida");
        }

    }
}