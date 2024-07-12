import java.util.Scanner;
public class Recursion02 {
    public static void printLinearNumbers(int i, int n){
        if(i > n){
            return;
        }
        System.out.print(i+" ");
        printLinearNumbers(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLinearNumbers(1,n);
        sc.close();
    }
}
