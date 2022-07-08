import javax.swing.*;

public class Ejercicio2Ciclos {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero: "));

        while(numero!=0 ){
            if(numero>0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es positivo! ");
            }
            else if (numero<0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es negativo! ");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero: "));
        }
    }
}

