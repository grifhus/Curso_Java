import javax.swing.*;

//Pedir dos numeros y decir cual es mayor o si son iguales
public class Ejercicio2Condicionales {
    public static void main(String[] args) {
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del numero 2"));

        if (numero1>numero2) {
            JOptionPane.showMessageDialog(null,"El numero "+numero1+" es mayor al numero "+numero2);
        }
        if (numero1<numero2){
            JOptionPane.showMessageDialog(null,"El numero "+numero1+" es menor al numero "+numero2);
        }
        else {
            JOptionPane.showMessageDialog(null,"Los numeros son iguales");
        }
    }
}
