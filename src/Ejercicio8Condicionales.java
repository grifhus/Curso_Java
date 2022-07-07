import javax.swing.JOptionPane;

public class Ejercicio8Condicionales {
    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 al 99,999"));

        if (numero < 10) {
            JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
        }
        if ((numero >= 10) && (numero < 100)) {
            JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");
        }
        if ((numero >= 100) && (numero < 1000)) {
            JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
        }
        if ((numero >= 1000) && (numero < 10000)) {
            JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
        }
        if ((numero >= 10000) && (numero < 100000)) {
            JOptionPane.showMessageDialog(null, "El numero tiene 5 cifras");
        }
        if (numero >= 1000000) {
            JOptionPane.showMessageDialog(null, "El numero esta fuera de rango");
        }


    }
}


