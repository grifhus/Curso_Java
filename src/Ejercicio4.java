import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
           /*
        Una compañia de venta de carros usados, paga a su personal de ventas
        un salario de $1000 mensuales, mas una comision de $150 por cada carro vendido,
        mas el 5% del valor de la venta por carro. Cada mes el capturista de la empresa
        ingresa en la computadora los datos pertinentes. Hacer un programa que calcule
        e imprima el salario mensual de un vendedor dado.
         */

        Scanner teclado = new Scanner(System.in);
        final int salarioFijo = 1000;
        int cantidadCarrosVendidos;
        double comision, valorCarroVendido, cincoPorCiento, sumatoriaCincoPorCiento = 0, salarioMensual;

        System.out.println("Salario fijo mensual: $1000");
        System.out.println("Comision de $150 por carro vendido");
        System.out.println("Cuantos carros vendió el vendedor?");
        cantidadCarrosVendidos = teclado.nextInt();
        System.out.println("Comision total de: $" + cantidadCarrosVendidos * 150);

        for (int i = 0; i < cantidadCarrosVendidos; i++) {
            System.out.println("Valor del carro vendido Nº" + (i + 1));
            valorCarroVendido = teclado.nextInt();
            cincoPorCiento = valorCarroVendido * 0.05;
            sumatoriaCincoPorCiento += cincoPorCiento;

        }
        salarioMensual = salarioFijo + cantidadCarrosVendidos * 150 + sumatoriaCincoPorCiento;
        System.out.println("El salario mensual del vendedor es de: $" + salarioMensual);

    }
}
