import javax.swing.*;

public class Ejercicio21Ciclos {
    public static void main(String[] args) {
        int numero;
        boolean hay_negativos = false;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if (numero < 0) {//SI el numero es negativo
                hay_negativos = true;
            }
        }
        if (hay_negativos == true) {
            System.out.println("Si existe al menos un numero negativo");
        } else {
            System.out.println("No existe ningun numero negativo");
        }
    }
}

