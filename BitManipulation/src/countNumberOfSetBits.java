import java.util.Scanner;
public class countNumberOfSetBits {
    /*
        We can also do the above code using core bit manipulation technique
       1.
        if(n & 1) -> odd check
        count += 1; -> counter increase
        n = n >> 1; -> equivalent to n /= 2

        OR

       2.
        count = 0;
        while(n != 0){
        n = n&(n-1);
        count++;
        }
        return count
        */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(n > 1){
            if(n % 2 == 1)
                count += 1;

            n /= 2;
        }
        if(n == 1)
            count += 1;

        System.out.println("The number of set bits in the given number n are : "+count);
    }
}
