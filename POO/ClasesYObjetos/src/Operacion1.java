/*
 parámetros y argumentos
 */


public class Operacion1 {
    //Atributos
    int suma, resta, multiplicacion, division;


    //Metodos

    //Metodo para sumar ambos numeros
    public void sumar(int numero1, int numero2) {
        suma = numero1 + numero2;

    }

    //Metodo para restar ambos numeros
    public void restar(int numero1, int numero2) {
        resta = numero1 - numero2;

    }

    //Metodo para Multiplicar ambos numeros
    public void multiplicacion(int numero1, int numero2) {
        multiplicacion = numero1 * numero2;

    }

    //Metodo para dividir ambos numeros
    public void division(int numero1, int numero2) {
        division = numero1 / numero2;

    }

    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }


}
