/*
construir un programa que calcule el area y el perimetro de un cuadrilatero
dada la longitud de sus dos lados. Los valores de la longitud
deberan introducirse por la linea de ordenes.Si es un cuadrado,
solo se proporcionara la longitud de uno de los lados al constructor.
 */


public class Cuadrilatero {
    //Atributos

    private float lado1;
    private float lado2;

    //Metodos

    //Metodo constructor 1 (Cuadrilatero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo constructor 2 (Cuadrado)
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;

    }

    public float getArea() {
        float area = (lado1 * lado2);
        return area;
    }
}
