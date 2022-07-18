public class Principal {
    public static void main(String[] args) {
        Vehiculo misVehiculos[]= new Vehiculo[4];

        misVehiculos[0]= new Vehiculo("GH56","Ferrari","A89");
        misVehiculos[1]= new VehiculoTurismo("JI78","Audi","P15",7);
        misVehiculos[2]= new VehiculoDeportivo("47GH","Toyota","Kj8",1000);
        misVehiculos[3]= new VehiculoFurgoneta("JIOJ78","Toyota","PK7",200000);

        for(Vehiculo vehiculos: misVehiculos){
            System.out.println(vehiculos.mostrarDatos());
            System.out.println("");
        }

    }
}
