import javax.swing.*;
import java.sql.SQLOutput;

public class Ejercicio3Ciclos {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while(numero!=0){//mientras el numero sea distinto a 0
            if(numero %2 == 0){//si el numero es par
                System.out.println("El numero "+numero+" es PAR");
            }else{
                System.out.println("El numero "+numero+" es Impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
    }
}
