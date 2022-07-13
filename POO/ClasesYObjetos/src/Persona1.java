public class Persona1 {
    //Atributos
    String nombre;
    int edad;
    String dni;

    //Metodos

    //Metodo constructor
    public Persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //SObrecarga constructor
    public Persona1(String dni) {
        this.dni = dni;
    }

    //Metodo
    public void correr() {
        System.out.println("Soy " + nombre + " tengo " + edad + " años y estoy corriendo un maraton");
    }

    //SObrecarga del metodo
    public void correr(int km) {
        System.out.println("He corrido " + km + " kilometros");

    }
}
