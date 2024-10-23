import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printPrimeFactors {
    private static List<Integer> getPrimeFactors(int n) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                lst.add(i);
            while (n % i == 0)
                n /= i;
        }
        if (n > 1)
            lst.add(n);
        return lst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> lst = getPrimeFactors(n);
        System.out.println(lst);
    }
}
