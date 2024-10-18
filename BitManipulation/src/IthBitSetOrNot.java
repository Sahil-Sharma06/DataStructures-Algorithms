import java.util.Scanner;
public class IthBitSetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        if((n & (1 << i)) != 0)
//            Alternate by using right shift operator if((n >> i) & 1 == 0) -> not set else set
            System.out.println("The bit at i'th position is set");
        else
            System.out.println("The bit is not set");
    }
}
