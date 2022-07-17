import java.util.Scanner;
/*
Ejercicio 5:Diseñar un programa para trabajar con triangulos isosceles.
Para ello defina los atributos necesarios que se requieren, proporcione metodos de consulta,
 un metodo constructor e implemente metodos para calcular el perimetro y el area de un triangulo,
 ademas implementar un metodo que a partir de una rreglo de triangulos
 devuelva el area del triangulo de mayor superficie.

 */
public class Principal {

    public static double mayorArea(Triangulo_Isosceles triangulos[]) {
        double area;

        area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() < area) {
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        System.out.println("Digite el numero de triangulos a ingresar:");
        nTriangulos = entrada.nextInt();


        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triangulo " + (i + 1) + ":");
            System.out.print("Introduzca la base: ");
            base = entrada.nextDouble();
            System.out.print("Introduzca el lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new Triangulo_Isosceles(base, lado);

            System.out.println("\nEl perimetro del triangulo es: " + triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: " + triangulos[i].obtenerArea());
        }
        System.out.println("\nEl area del triangulo de mayor superficie es: " + mayorArea(triangulos));

    }
}
