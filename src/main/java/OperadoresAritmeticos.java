import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        float numero1, numero2, suma, resta, mult, div, resto;

        System.out.println("Digita 2 numeros: ");
        numero1 = entradas.nextFloat();
        numero2 = entradas.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;
        resto = numero1 % numero2;

        System.out.println("La suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("La multiplicaion es: "+mult);
        System.out.println("la division es: "+ div);
        System.out.println("El resto es: "+resto);


    }

}
