//Miembros estaticos de una clase

public class Estatico {

    private static String frase = "Primera frase";

    public static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {
/*
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();

        ob2.frase= "Segunda frase";
        // Todos los objetos van a compartir la ultima modificacion atributo statico


        System.out.println(ob1.frase);
        System.out.println(ob2.frase);

 */
        System.out.println(Estatico.frase);
        System.out.println("La suma es: " + Estatico.sumar(3, 4));


    }
}
