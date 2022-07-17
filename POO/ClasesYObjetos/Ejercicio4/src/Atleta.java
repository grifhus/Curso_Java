public class Atleta {
    private int idAtleta;
    private String nombre;
    private float tiempo;

    public Atleta(int idAtleta, String nombre, float tiempo) {
        this.idAtleta = idAtleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }
    public String mostrarDatos(){
        return "Atleta: " + nombre + "\nID: " + idAtleta + "\ntiempo: " + tiempo + "\n";
    }
}
