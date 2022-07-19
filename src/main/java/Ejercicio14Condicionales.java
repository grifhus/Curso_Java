import javax.swing.*;
public class Ejercicio14Condicionales {
    public static void main(String[] args) {
        double kg,libras,toneladas,onzas,gramos;
        int opc;

        opc=Integer.parseInt(JOptionPane.showInputDialog("Conversor de KG a:\n"
                + "Selecione una opcion:\n"
                +"1.- Libras\n"
                +"2.- Onzas\n"
                +"3.- Gramos\n"
                +"4.- Toneladas"));


        if((opc>=1)&&(opc<=4)){
            kg=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los KG a convertir: "));

            switch(opc){
                case 1: libras= kg*2.20462;
                    JOptionPane.showMessageDialog(null,"Equivale a: "+libras+" Libras.");break;
                case 2: onzas= kg*35.274;
                    JOptionPane.showMessageDialog(null,"Equivale a: "+onzas+" Onzas.");break;
                case 3: gramos= kg*1000;
                    JOptionPane.showMessageDialog(null,"Equivale a: "+gramos+" gramos.");break;
                case 4: toneladas= kg/1000;
                    JOptionPane.showMessageDialog(null,"Equivale a: "+toneladas+" Toneladas.");break;
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Operacion No Reconocida.");
        }
    }
    }

