/*
Pedir numeros hasta que se teclee un 0,mostrar la suma de todos los numeros introducidos
 */

import javax.swing.*;

public class Ejercicio6Ciclos {
    public static void main(String[] args) {
        int numero, contador= 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if  (numero==0){
                System.out.println("La suma de los numeros es "+contador);
            }else{
                System.out.println("Ingrese otro numero ");
            }
            contador =numero+contador;

        }while (numero != 0);
    }
}
