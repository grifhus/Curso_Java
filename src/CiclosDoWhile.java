/*
Ciclo do While

do{
    Instrucciones;
}while(condiciones);
 */

import java.util.Scanner;

public class CiclosDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=1,contador;

        System.out.println("Digite la cantidad de terminos: ");
        contador = entrada.nextInt();

        do{
            System.out.println(i);
            i++;
        }while(i<=contador);


    }
}
