import java.util.Scanner;

public class Ejercicio10Ciclos {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int num, sum = 0;
        for(int i = 1; i<= 10;i++){
            System.out.println("Digite un numero hasta que sean 10: ");
            num = x.nextInt();
            sum += num;
        }
        System.out.println("En total es: "+sum);
    }
}
