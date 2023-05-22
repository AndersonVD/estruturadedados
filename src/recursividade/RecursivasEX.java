package recursividade;

public class RecursivasEX {
    public static int fatorial(int n) {
        if (n == 1) {
            System.out.print(String.valueOf(n) + "=");
            return 1;
        } else {
            System.out.print(String.valueOf(n) + "*");
            return n * fatorial(n - 1);
        }
    }

    public static int soma_n_pos(int n) {
        // – Cálculo da soma dos n primeiros números inteiros positivos
        if (n == 1) {
            System.out.print(String.valueOf(n) + "=");
            return 1;
        } else {
            System.out.print(String.valueOf(n) + "+");
            return n + soma_n_pos(n - 1);
        }
    }

    public static int eq1(int n) {
        // R(X) = 2 * R(X-1) – 4, para X > 0 (chamada recursiva)
        // R(0) = 2 (base)
        int res;
        if (n == 0) {
            res = 2;
        } else {
            res = 2 * (eq1(n - 1)) - 4;
        }
        System.out.println("f(" + n + ") = " + res);
        return res;
    }

    public static int vezes_raiz(int n, int m) {
        if (m == 1) {
            return n;
        } else {
            return n + vezes_raiz(n, m - 1);
        }
    }

    public static int somatorio_ex1(int n) {
        if (n == 1) {
            return 2 * n + 2 * n + 8;
        } else {
            return (int) (2 * Math.pow(n, 2) + 2 * n + 8) + somatorio_ex1(n - 1);
        }
    }

}