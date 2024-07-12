import java.util.Scanner;
// Parameterised way of recursion 
public class Recursion04 {

    public static int printSum(int i, int sum){
        if(i < 1){
            System.out.println("Sum = "+sum);
        return 0;
        }

       return printSum(i-1, sum+i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n,0);
        sc.close();
    }
}
