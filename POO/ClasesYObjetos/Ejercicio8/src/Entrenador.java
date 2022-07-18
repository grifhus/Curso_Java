public class Entrenador extends Persona{
    String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    @Override
    public String toString() {
        return "Entrenador\n"+super.toString()+"\nEstrategia: "+estrategia;
    }
}
