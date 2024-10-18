import java.util.Scanner;
public class toggleItBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int res = n ^ (1 << i);
        System.out.println("The number obtained is : "+res);
    }
}
