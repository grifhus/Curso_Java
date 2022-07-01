import java.util.Scanner;

public class Ejercicio1 {
    // Ejercicio 1- Calcular la suma de 3 notas
    // Hacer un programa que calcule e imprima la suma de tres calificaciones
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, suma;

        //Guardamos las 3 notas
        System.out.println("Digite 3 calificaciones: ");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        //Sumamos las 3 notas
        suma = nota1 + nota2 + nota3;
        System.out.println("\n La suma es: " + suma);
    }
}