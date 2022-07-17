    import javax.swing.*;

    public class Clase2 {
        public static void main(String[] args) {
            clase1 operaciones1 = new clase1();

            float numero1, numero2, imaginario1, imaginario2, entero;
            int opcion;

            opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido, escoja una opcion:"
                    + "\n1-Sumar dos numeros complejos"
                    + "\n2-Multiplicar dos numeros complejos"
                    + "\n3-Comparar 2 numeros complejos"
                    + "\n4-Multiplicar un numero complejo por un entero"
                    + "\n5-Salir"));

            switch (opcion) {
                case 1:
                    numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero entero: "));
                    numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero entero: "));
                    imaginario1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero imaginario: "));
                    imaginario2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero imaginario: "));

                    System.out.println("La suma de los numeros complejos es: " + operaciones1.sumaNumerosComplejos());

                    break;

                case 2:
                    numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero entero: "));
                    numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero entero: "));
                    imaginario1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero imaginario: "));
                    imaginario2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero imaginario: "));

                    System.out.println("La multiplicacion de los numeros complejos es: " + operaciones1.multiplicacionNumeroComplejos());

                    break;

                case 3:
                    numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero entero: "));
                    numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero entero: "));
                    imaginario1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero imaginario: "));
                    imaginario2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero imaginario: "));

                    System.out.println(operaciones1.compararNumerosComplejos());

                    break;

                case 4:
                    numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero entero: "));
                    imaginario2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero imaginario: "));
                    entero = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero entero: "));

                    System.out.println("La suma de los numeros complejos es: " + operaciones1.multiplicarEnteroPorComplejos());

                    break;

                case 5:
                    System.out.println("Adios!...");
                    break;

                default:
                    System.out.println("Opcion no disponible");
            }
        }
    }


