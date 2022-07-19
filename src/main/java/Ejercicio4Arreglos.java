    /*
    Leer 10 numeros enteros, guardarlos en una arreglo. Debemos mostrarlos en el siguiente orden:
     el primero, el ultimo, el segundo, el penultimo, eltercero, etc.
     */


    import java.util.Scanner;

    public class Ejercicio4Arreglos {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int[] num = new int[10];
            int j = 9;

            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ".- Ingrese un número: ");
                num[i] = in.nextInt();
            }

            System.out.println("El orden intercalado entre los primeros y los últimos es: ");

            for (int i = 0; i < 5; i++) {
                System.out.println(num[i]);
                System.out.println(num[j]);
                j--;
            }
        }
    }


