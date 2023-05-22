package recursividade;

public class recursivo {
    public static int fatorial(int n) {
        // caso-base: fatorial de 1 é igual a 1
        if (n == 1) {
            return 1;
        }
        // caso recursivo: fatorial de n é igual a
        // n * fatorial de n-1
        else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int fatorialDeN = fatorial(n);
        System.out.println("Fatorial de " + n + " = " + fatorialDeN);

    }
}
