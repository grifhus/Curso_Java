public class TiposDeDatos {
    public static void main(String[] args) {

        //Numeros Enteros
        byte entero = 12;                                        // Tamano 8 byte de memoria
        System.out.println("Numero entero byte: " + entero);
        short entero1 = 3243;                                    // Tamano 16 byte de memoria
        System.out.println("Numero entero short: " + entero1);
        long entero2 = 32243658765l;                            // Tamano 64 byte de memoria y debe ir con la letra "l" al final del numero
        System.out.println("Numero entero long: " + entero2);
        int entero3 = 213436;                                   // Tamano 32 byte de memoria. es el que mas se utiliza
        System.out.println("Numero entero int: " + entero3);

        //Numeros Decimales
        float decimal = 3.45f;                                   //Tamano 32 byte de memoria y debe ir con la letra "f" al final del numero
        System.out.println("Numero decimal float: " + decimal);
        double decimal1 = 23.434;                                 //Tamano 64 byte de memoria. es el mas comun
        System.out.println("Numero decimal double: " + decimal1);

        //Dato Tipo Caracter
        char caracter = 'D';
        System.out.println("Esto es un caracter char :"+caracter);    // solo 1 caractere
        //Tipo Booleano
        boolean decision = true;                                  // Puede ser true o false, se utilizan bastante en condicionaes
        System.out.println("Tipo booleano es: "+decision);

    }
}
