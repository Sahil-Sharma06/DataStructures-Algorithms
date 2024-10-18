import java.util.Scanner;
public class clearIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();

        int res = ~(1 << i);
        System.out.println("The new number after clearing the i'th bit : "+res);
    }
}
