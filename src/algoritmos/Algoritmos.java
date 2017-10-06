package algoritmos;

public class Algoritmos {

    public static void quadrado(double n) {
        double r = n * n;
    }

    public static double metade(double v) {
        double r = v / 2;
        return r;
    }

    public static void main(String[] args) {
        double raiz, res;
        raiz = Math.sqrt(15);
        System.out.println(raiz);
        
        res = metade(2);
        System.out.println(res);

    }

}
