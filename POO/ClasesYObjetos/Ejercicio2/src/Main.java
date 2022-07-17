/*Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto
 dentro de un tablero y actualice su posicion dentro del mismo.
 los movimientos posibles son ARRIBA, ABAJO, IZQUIEDA Y DERECHA.
 Tras cada movimiento el programa mostrara la nueva direccion elegida
 y las coordenadas de situacion del objeto dentro del tablero.
 */



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean x = false;
        do {
            System.out.print("Introduzca una accion : ");
            String d = entrada.nextLine();
            Posicion op = new Posicion(d.toUpperCase());
            op.ImprimirPos();
            if (op.saliendo() == true) {
                x = true;
                break;
            }

        } while (x == false);
        System.out.println("Fin");

    }
}


