public class Futbolista extends Persona{
     int dorsal;
    String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return "Jugador\n"+super.toString()+"\nDorsal: "+dorsal+"\nPosicion: "+posicion;
    }
}
