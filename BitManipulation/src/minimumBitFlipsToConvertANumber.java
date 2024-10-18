import java.util.Scanner;
public class minimumBitFlipsToConvertANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int goal = sc.nextInt();

        int ans = start^goal;

//        Now the number of setbits is the answer
        int count = 0;
        while(ans != 0){
            ans = ans & (ans-1);
            count++;
        }

        System.out.println("The minimum flips to convert the number to get changed to goal is : "+count);
    }
}
