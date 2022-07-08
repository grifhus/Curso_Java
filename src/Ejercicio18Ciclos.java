import javax.swing.*;

public class Ejercicio18Ciclos {
    public static void main(String[] args) {

        int codigo, litros, litrosArticulo1 = 0, conteoMas600 = 0, opcionProducto;
        float importeFactura, facturacionTotal = 0;
        double precioLitrouno = 0.6, precioLitrodos = 3, precioLitrotres = 1.25;

        for (int i = 1; i <= 5; i++) {

            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N:" + i + "\nDigite el codigo"));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N:" + i + "\nDigite la cantidad en litros"));
            opcionProducto = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del producto"));

            switch (opcionProducto) {
                case 1:
                    importeFactura = (float) ((float) litros * precioLitrouno); // importe factura
                    facturacionTotal += importeFactura; // suma iteractiva de las facturas

                    if (codigo == 1) {
                        litrosArticulo1 += litros;

                    }

                    if (importeFactura > 600) {
                        conteoMas600++;

                    }

                    break;

                case 2:
                    importeFactura = (float) ((float) litros * precioLitrodos);
                    facturacionTotal += importeFactura; // suma iteractiva de las facturas

                    if (codigo == 1) {
                        litrosArticulo1 += litros;

                    }

                    if (importeFactura > 600) {
                        conteoMas600++;

                    }

                    break;

                case 3:

                    importeFactura = (float) ((float) litros * precioLitrotres);
                    facturacionTotal += importeFactura; // suma iteractiva de las facturas
                    if (codigo == 1) {
                        litrosArticulo1 += litros;

                    }

                    if (importeFactura > 600) {
                        conteoMas600++;

                    }

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No existe ese producto:");
                    break;

            }

        }

        System.out.println("Resumen de ventas");
        System.out.println("Facturacion total:" + facturacionTotal);
        System.out.println("Cantidad en litros vendidos del articulo:" + litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a 600:" + conteoMas600);

    }

}


