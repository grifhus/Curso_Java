import javax.swing.*;

//En Ara se hace un 20% de descuento a los clientes cuya compra supere los 300000
//¿cual sera la cantidad que pagara una persona por su compra
public class Ejercicio4Condicionales {
    public static void main(String[] args) {
        int cantidad, descuento,total;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de su compra: "));
        if (cantidad>300000){
            descuento = (cantidad*20)/100;
            total = cantidad-descuento;
            JOptionPane.showMessageDialog(null,"Cantidad a pagar es: "+total);
        }
        else {
            JOptionPane.showMessageDialog(null,"Total a pagar es: "+cantidad);

        }
    }
}
