import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // La calificacion final de un estudiante de informatica se calcula con base a las calificaciones
        //  de cuatro aspectos de su rendimiento academinco;
        //  participacion, primer examen parcial, segundo examen parcial y examen final.
        //  Sabiendo que las calificaciones anteriores entran a la calificacion final
        //  con ponderaciones del 10 %, 25 %, 25 % y 40 $, hacer un programa que calcule e
        // imprima la calificacion final obtenida por un estudiante.
        Scanner entrada = new Scanner(System.in);
        float participacion, parcial1, parcial2, examenfinal, notafinal;
        //Pedir los datos al usuario
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite nota del parcial 1: ");
        parcial1 = entrada.nextFloat();
        System.out.println("Digite nota del parcial 2: ");
        parcial2 = entrada.nextFloat();
        System.out.println("Digite nota del examen final: ");
        examenfinal = entrada.nextFloat();
        // scacamos los calculos
        participacion *= 0.10f;
        parcial1 *= 0.25f;
        parcial2 *= 0.25f;
        examenfinal *= 0.40F;
        //sumamos las notas
        notafinal = participacion + parcial1 + parcial2 + examenfinal;
        //imprimir resultado en pantalla
        System.out.println("\nLa nota final es: "+notafinal);
    }
}
