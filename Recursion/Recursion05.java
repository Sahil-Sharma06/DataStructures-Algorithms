import java.util.*;
// Functional way of recursion
public class Recursion05 {

    public static int printSum(int n){
        if(n == 0)
        return 0;

        return n+printSum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum = " +printSum(n));
        sc.close();
    }
}
