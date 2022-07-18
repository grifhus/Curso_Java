public class Doctor extends Persona {
    int añosxp;
    String titulo;

    public Doctor(String nombre, String apellido, int edad, int añosxp, String titulo) {
        super(nombre, apellido, edad);
        this.añosxp = añosxp;
        this.titulo = titulo;
    }

    public int getAñosxp() {
        return añosxp;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Doctor\n"+ super.toString()+
                "\nAños de experiencia: " + añosxp +
                "\nTitulo: " + titulo ;
    }
}
