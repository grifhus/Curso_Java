//Pedir 10 numeros.mostrar la media de los numeros positivos,
// la media de los numeros negativos y la cantidad de ceros.

import javax.swing.*;

public class Ejercicio13Ciclos {
    public static void main(String[] args) {
        int numero, suma_pos = 0, conteo_pos = 0, suma_neg = 0, conteo_neg = 0, conteo_ceros = 0;
        float media_pos, media_neg;

        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            if (numero == 0) {//Si el numero es 0
                conteo_ceros++;//aumentamos en 1 el conteo de 0
            } else if (numero > 0) {//Si el numero es positivo
                suma_pos += numero; //Suma iterativa de positivos
                conteo_pos++;
            } else {//Si el numero es negativo
                suma_neg += numero;
                conteo_neg++;
            }

        }
        //Tratamos con los positivos
        if (conteo_pos == 0) {
            System.out.println("No se puede sacar la media de los positivos");
        } else {
            media_pos = (float) suma_pos / conteo_pos;
            System.out.println("La media de los numeros positivos: " + media_pos);
        }
        //Tratamos con los negativos
        if (conteo_neg == 0) {
            System.out.println("No se puede sacar la media de los negativos: ");
        } else {
            media_neg = (float) suma_neg / conteo_neg;
            System.out.println("La media de los engativos: " + media_neg);
        }
        System.out.println("La cantidad de ceros es: "+conteo_ceros);

    }
}

