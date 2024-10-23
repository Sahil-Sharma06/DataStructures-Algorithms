import java.util.Scanner;

public class smallestPrimeFactorisation {

    private static int[] sieveOfSPF(int n) {
        int[] spf = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            spf[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) {
                        spf[j] = i;
                    }
                }
            }
        }

        return spf;
    }

    private static void primeFactorization(int n, int[] spf) {
        while (n != 1) {
            System.out.print(spf[n] + " ");
            n /= spf[n];
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] spf = sieveOfSPF(n);

        for (int i = 2; i <= n; i++) {
            System.out.print("Prime factorization of " + i + ": ");
            primeFactorization(i, spf);
        }
    }
}
