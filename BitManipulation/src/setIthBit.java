import java.util.Scanner;
public class setIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int res = n | (1 << i);
        System.out.println("The new number after setting the i'th bit is : "+res);
    }
}
