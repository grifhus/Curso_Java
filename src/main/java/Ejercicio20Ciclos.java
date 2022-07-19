import java.util.Scanner;

public class Ejercicio20Ciclos {
    public static void main(String[] args) {


        int numero, sueldo, sueldoMayor = 0, sueldoBase = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println("Digite un sueldo: ");
            sueldo = entrada.nextInt();


            if (sueldo < sueldoBase) {
                sueldoBase = sueldo;
            } else if (sueldoMayor < sueldo) {
                sueldoMayor = sueldo;

            }
        }
        System.out.println("El sueldo mayor es: " + sueldoMayor);
    }
}
