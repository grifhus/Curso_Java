public class OpeIncrementoDecremento {
    public static void main(String[] args) {
        int x = 5, y;
        x++;                    // x+=1; equivale
        x--;
        y = x++;                // lo que sucede es que damos la asignacion de "x" con valor 5 a "y" y despues "x" se suma 1
                                // esto se debe a que estamos poniendo ++ como sufijo , despues de la variable
        y = ++x;
        y = x--;
        System.out.println(y);
        System.out.println(x);
    }
}
