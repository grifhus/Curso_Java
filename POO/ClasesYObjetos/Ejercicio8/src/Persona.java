public abstract class Persona {
    String nombre,apellido;
    int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return  "Nombre:  " + nombre +
                "\nApellido: "+ apellido +
                "\nEdad: " + edad;
    }
}
