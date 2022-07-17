import java.util.Scanner;

public class Main {
    public static int indiceAtletaMasRapido(Atleta corredores[]) {
        float tiempo;
        int indice = 0;

        tiempo = corredores[0].getTiempo();
        for (int i = 1; i < corredores.length; i++) {
            if (corredores[i].getTiempo() < tiempo) {
                tiempo = corredores[i].getTiempo();
                indice = i;
            }
        }
        return indice;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        float tiempo,masVeloz;
        int numeroAtletas, idAtleta;

        System.out.print("Digite la cantidad de atletas: ");
        numeroAtletas = entrada.nextInt();

        //Creamos los objetos para los atletas
        Atleta corredores[] = new Atleta[numeroAtletas];

        for (int i = 0; i < corredores.length; i++) {
            entrada.nextLine();
            System.out.println("Digite las caracteristicas de los atletas" + (i + 1) + ":");
            System.out.print("Introduzca el Nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Introduzca el ID del atleta: ");
            idAtleta = entrada.nextInt();
            System.out.print("Introduzca el tiempo de carrera: ");
            tiempo = entrada.nextFloat();

            corredores[i] = new Atleta(idAtleta, nombre, tiempo);

        }
        masVeloz = indiceAtletaMasRapido(corredores);
        System.out.println("\nEl atleta mas rapido es: ");
        System.out.println(corredores[(int) masVeloz].mostrarDatos());
    }


}
