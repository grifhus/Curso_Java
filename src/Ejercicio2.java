import java.util.Scanner;

public class Ejercicio2 {
    //hacer un programa que calcule e imprima el salario semanal de un empleado
    //a partir de sus horas semanales trabajadas y de su salario por hora
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        double horas, salario, pago;

        System.out.println("Digite horas semanales trabajdas y salario por hora: ");
        horas = escaner.nextDouble();
        salario = escaner.nextDouble();

        pago = horas * salario;

        System.out.println("Tu salario semanal es: " + pago);
    }
}
