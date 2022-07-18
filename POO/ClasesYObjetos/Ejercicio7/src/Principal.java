/*
Ejercicio 7: Hacer un programa para calcular el area de poligonos(Triangulos y Rectangulos) el programa debe ser capaz de almacenar en un arreglo N triangulos y rectanculos, y al final mostrar el area y los datos de cada uno. Para ello se tendra lo siguiente:
-Una super clase llamada Poligono
-Una sub clase llamada Rectangulo
-una sub clase llamada Triangulo
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner entryScanner = new Scanner(System.in);

    public static void main(String[] args) {
        //LLenar un poligono
        llenarPoligono();

        //mostrar los datos y el area de cada poligono
        mostrarResultados();

    }

    public static void llenarPoligono() {
        char respuesta;
        int opcion;
        do {
            do {
                System.out.println("Digite que poligono desea");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.print("Opcion: ");
                opcion = entryScanner.nextInt();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1:
                    llenarTriangulo();//LLenar un Triangulo
                    break;
                case 2:
                    llenarRectangulo();//LLenar un Rectangulo
                    break;
            }
            System.out.println("\nDesea introducir otro poligono(s/n): ");
            respuesta = entryScanner.next().charAt(0);
            System.out.println("");
        } while (respuesta == 's' || respuesta == 'S');
    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.print("\nDigite el lado1 del triangulo: ");
        lado1 = entryScanner.nextDouble();
        System.out.print("\nDigite el lado2 del triangulo: ");
        lado2 = entryScanner.nextDouble();
        System.out.print("\nDigite el lado3 del triangulo: ");
        lado3 = entryScanner.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        //Guardamos un triangulo dentro de nuestro arreglo de poligonos
        poligonos.add(triangulo);
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.print("\nDigite el lado1 del rectangulo: ");
        lado1 = entryScanner.nextDouble();
        System.out.print("\nDigite el lado2 del rectangulo: ");
        lado2 = entryScanner.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligonos.add(rectangulo);
    }

    public static void mostrarResultados(){
        //Recorriendo el arreglo de poligonos
        for (Poligono poli: poligonos){
            System.out.println(poli.toString());
            System.out.println("Area: "+poli.area());
            System.out.println("");
        }
    }
}
