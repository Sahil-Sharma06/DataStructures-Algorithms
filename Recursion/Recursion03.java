import java.util.Scanner;
public class Recursion03 {
    public static void printLinearNumbers(int i, int n){
        if(i > n){
            return;
        }
        printLinearNumbers(i+1, n);
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLinearNumbers(1,n);
        sc.close();
    }
}
