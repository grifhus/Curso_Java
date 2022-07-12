import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ArregloLlenar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de elmentos del arreglo: "));

        char[] letras = new char[nElementos];

        System.out.println("Digite los elementos del arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i + 1) + ". Digite un caracter: ");
            letras[i]=entrada.next().charAt(0);

        }
        System.out.println("\nLos caracteres del arreglo son :");
        for (int i = 0; i < nElementos; i++){
          // System.out.println(letras[i]);
           System.out.print(letras[i]+" ");
        }
    }
}
