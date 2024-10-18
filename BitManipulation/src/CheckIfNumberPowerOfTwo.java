import java.util.Scanner;
public class CheckIfNumberPowerOfTwo {
//    Every power of 2 can have 1 setbit in its binary
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n & n-1) == 0)
            System.out.println("The number is a power of 2.");
        else
            System.out.println("The number is not a power of 2.");
    }
}
