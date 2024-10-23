import java.util.Scanner;
public class checkIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count += 1;  // Count divisor 'i'
                if (i != n / i) {
                    count += 1;  // Count divisor 'n / i' if it's different from 'i'
                }
            }
        }

        if (count == 2)
            System.out.println("The number is Prime.");
        else
            System.out.println("The number is not Prime.");
    }
}
