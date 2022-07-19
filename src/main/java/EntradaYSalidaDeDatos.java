import java.util.Scanner;

public class EntradaYSalidaDeDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;                                             // dato tipo Entero
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();                             //.nextInt() guardamos el dato tipo entero dentro de la variable numero
        System.out.println("El numero es :" + numero);

        float numero1;                                          // dato tipo Decimal
        System.out.println("Digite un numero decimal: ");
        numero1 = entrada.nextFloat();
        System.out.println("El numero Decimal Float es : " + numero1);  //.nextFloat() guardamos el dato tipo decimal dentro de la variable numero1
        //Al ingresar el numero decimal debemos ingresarlo con ","
        double numero2;
        System.out.println("Digite un numero decimal: ");
        numero2 = entrada.nextDouble();
        System.out.println("El numero Decimal Double es : " + numero2); //.nextDouble()  guardamos el dato tipo decimal dentro de la variable numero2

        String cadena;
        System.out.println("Digite una Cadena: ");
        cadena = entrada.next();
        System.out.println("la cadena es : " + cadena);                 //.next() Solo guarda una cadena hasta que encuentre un espacio

        String cadena2;
        System.out.println("Digite una Cadena: ");
        cadena2 = entrada.nextLine();
        System.out.println("la cadena es : " + cadena2);                //.nextLine() Guarda el texto completo

        char letra;
        System.out.println("Digite una Letra: ");
        letra = entrada.next().charAt(0);
        System.out.println("la letra es : " + letra);                   //.next().charAt(0) Lee el primer caracter


    }
}
