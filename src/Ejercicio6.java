import java.util.Scanner;

public class Ejercicio6 {
    //Hacer un programa que calcule el cuadrado de una suma
    public static void main(String[] args) {
        int a,b,resultado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite valor de a: ");
        a = entrada.nextInt();
        System.out.println("Digite valor de b: ");
        b = entrada.nextInt();
        resultado = (int) (Math.pow(a,2)+Math.pow(b,2)+ 2*(a*b));
        System.out.println("El cuadrado de la suma es: "+resultado);
    }
}
