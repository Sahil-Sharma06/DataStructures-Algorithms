import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printListOfPrimeNumbers {

    private static boolean isPrime(int n){
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
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
       for(int i = 2 ; i <= n ; i++){
           if(n % i == 0){
               if(isPrime(i))
                   lst.add(i);
           }
       }

        System.out.println("The list of all prime factors of N are : "+lst);
    }
}
