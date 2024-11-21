import java.util.Scanner;

public class maxPointsByCards {

    public static int maxPoints(int[] arr, int k){
        int n = arr.length;
        int lSum = 0, rSum = 0;

        for (int i = 0; i < k; i++) {
            lSum += arr[i];
        }

        int maxSum = lSum;

        int rightIndex = n - 1;
        for (int i = k - 1; i >= 0; i--) {
            lSum -= arr[i];
            rSum += arr[rightIndex];
            rightIndex -= 1;
            maxSum = Math.max(maxSum, lSum + rSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of cards: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the points for each card:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of cards to pick: ");
        int k = sc.nextInt();

        int result = maxPoints(arr, k);
        System.out.println("Maximum points you can obtain: " + result);
    }
}
