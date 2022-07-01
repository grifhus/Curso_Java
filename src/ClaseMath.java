public class ClaseMath {
    // raiz cuadrada (Math.sqrt)
    // elevar a potencia (Math.pow)
    // redondear numero (Math.round)
    // numero aleatorio (Math.random)
    public static void main(String[] args) {
        // raiz cuadrada (Math.sqrt)
        double raiz = Math.sqrt(9);
        int raiz1 = (int) Math.sqrt(9);
        System.out.println(raiz);
        System.out.println(raiz1);

        // elevar a potencia (Math.pow)
        double base = 5, exponente = 3;
        double resultado = Math.pow(base, exponente);
        System.out.println(resultado);

        // redondear numero (Math.round)
        double numero = 4.56;
        long resultado1 = Math.round(numero);
        System.out.println(resultado1);

        // numero aleatorio (Math.random)
        double numero1 = Math.random();
        System.out.println(numero1);


    }
}
