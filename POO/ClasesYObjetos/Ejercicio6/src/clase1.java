/*
Ejercicio6: Construir un programa para trabajar con 2 numeros complejos, implemente el siguiente menu:
1- Sumar dos numeros complejos
2- Multiplicar 2 numeros complejos
3- Comparar 2 numeros complejos(iguales o no)
4- Multiplicar un numero complejo por un entero
 */




public class clase1 {
    private float numero1;
    private float numero2;
    private float imaginario1;
    private float imaginario2;
    private int entero;

    public float sumaNumerosComplejos() {
        float sumaComplejos = (numero1 + numero2) + (imaginario1 + imaginario2);
        return sumaComplejos;
    }

    public float multiplicacionNumeroComplejos() {
        float multiplicacionCompleja = (numero1 * numero2) + (imaginario1 * imaginario2);
        return multiplicacionCompleja;
    }

    public String compararNumerosComplejos() {
        if (numero1 == numero2 && imaginario1 == imaginario2) {
            return "Todos los numeros son iguales";
        } else {
            return "No todos los numeros son iguales";
        }
    }

    public float multiplicarEnteroPorComplejos() {
        float multiplicarEnteroPorComplejo = (numero2 * entero) + (imaginario2 * entero);
        return multiplicarEnteroPorComplejo;
    }
}

