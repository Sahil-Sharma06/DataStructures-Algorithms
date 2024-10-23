import java.util.Scanner;
public class exponentOfTwoNumbers {
    private static int exponent(int x, int n){
        int ans = 1;
        while(n > 0){
            if(n % 2 == 1){
                ans = ans*x;
                n = n-1;
            }else{
                n /= 2;
                x = x*x;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(exponent(x,n));
    }
}
