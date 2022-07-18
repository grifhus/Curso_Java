import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    static ArrayList<Persona> todos = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        mostrar();
    }
    public static void menu(){
        int opcion;
        do{
            System.out.println("Digite una opcion: ");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de Futbol");
            opcion = entrada.nextInt();
        }while(opcion < 1 || opcion > 3);

        switch(opcion){
            case 1:
                viajeEquipo();
                break;
            case 2:
                entrenamiento();
                break;
            case 3:
                partidoFutbol();
                break;
        }
    }

    public static void viajeEquipo(){
        int opcion;
        char letra;
        do{
            do{
                System.out.println("Quien va a viajar:");
                System.out.println("1. Introducir jugador");
                System.out.println("2. Introducir entrenador");
                System.out.println("3. Doctor");
                opcion = entrada.nextInt();
            }while(opcion < 1 || opcion > 3);

            switch(opcion){
                case 1:
                    altaFutlista();
                    break;
                case 2:
                    altaEntrenador();
                    break;
                case 3:
                    altaDoctor();
                    break;
            }

            System.out.println("Desea introducir a alguien más: S/N");
            letra = entrada.next().charAt(0);
        }while(letra == 's' || letra == 'S');
    }

    public static void entrenamiento(){
        int opcion;
        char letra;
        do{
            do{
                System.out.println("Quienes van a entrenar:");
                System.out.println("1. Introducir jugador");
                System.out.println("2. Introducir entrenador");
                opcion = entrada.nextInt();

            }while(opcion < 1 || opcion > 2);

            switch(opcion){
                case 1:
                    altaFutlista();
                    break;
                case 2:
                    altaEntrenador();
                    break;
            }

            System.out.println("Desea introducir a alguien más: S/N");
            letra = entrada.next().charAt(0);
        }while(letra == 's' || letra == 'S');
    }

    public static void partidoFutbol(){
        char letra;

        do{
            System.out.println("Digite los datos del jugador que estara en el partido:");
            altaFutlista();

            System.out.println("Desea introducir a alguien más: S/N");
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }
    public static void mostrar(){
        for(Persona per : todos){
            System.out.println(per.toString());
        }
    }

    public static void altaFutlista(){
        Futbolista futbolista;
        String nombre;
        String apellido;
        int edad;
        int dorsal;
        String posicion;

        entrada.nextLine();
        System.out.println("Digite el nombre del jugador");
        nombre = entrada.nextLine();
        System.out.println("Digite el apellido");
        apellido = entrada.nextLine();
        System.out.println("Digite la edad");
        edad = entrada.nextInt();
        System.out.println("Digite el dorsal");
        dorsal = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite la posicion");
        posicion = entrada.nextLine()+"\n";

        futbolista = new Futbolista(nombre, apellido,edad,dorsal,posicion);
        todos.add(futbolista);
    }

    public static void altaEntrenador(){
        Entrenador entrenador;
        String nombre;
        String apellido;
        int edad;
        String estrategia;

        entrada.nextLine();
        System.out.println("Digite el nombre del entrenador");
        nombre = entrada.nextLine();
        System.out.println("Digite el apellido");
        apellido = entrada.nextLine();
        System.out.println("Digite la edad");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite la estrategia a utilizar");
        estrategia = entrada.nextLine()+"\n";

        entrenador = new Entrenador(nombre,apellido,edad,estrategia);
        todos.add(entrenador);
    }

    public static void altaDoctor(){
        Doctor doctor;
        String nombre;
        String apellido;
        int edad;
        int anosExp;
        String titulo;

        entrada.nextLine();
        System.out.println("Digite el nombre del doctor");
        nombre = entrada.nextLine();
        System.out.println("Digite el apellido");
        apellido = entrada.nextLine();
        System.out.println("Digite la edad");
        edad = entrada.nextInt();
        System.out.println("Digite los años de experiencia");
        anosExp = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite la especializacion");
        titulo = entrada.nextLine()+"\n";


        doctor = new Doctor(nombre,apellido,edad,anosExp,titulo);
        todos.add(doctor);
    }
}

