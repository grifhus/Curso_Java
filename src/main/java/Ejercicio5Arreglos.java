import java.util.Scanner;

/*
Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una
tercera de la forma: el 1 de A, el 1 de B, el 2 de A, el 2 de B, etc.
 */
public class Ejercicio5Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[], b[], c[];

        a = new int[10];//Arreglo a con 10 elementos
        b = new int[10];//Arreglo b con 10 elementos
        c = new int[20];//Arreglo c con 20 elementos

        //pedimos el arreglo a
        System.out.println("Digite el primer arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        //pedimos el arreglo b
        System.out.println("\nDigite el segundo arreglo: ");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        // Ahora, vamos a mezclar los 2 arreglos en c
        //vamos a utilizar el iterador i para a y b
        // y el iterador j para el arreglo c
        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("\nEl tercer arreglo es: ");
        for (int i=0;i<20;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}
