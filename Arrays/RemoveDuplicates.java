import java.util.*;
public class RemoveDuplicates {

    // BruteForce Approach
    public static int removeDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for(int x: set){
            arr[++j] = x;
        }

        return k;
    }

    // Optimal Approach
    public static int removeDuplicatesOptimal(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println("The number of duplicate elements in the array is: "+removeDuplicates(arr));
        System.out.println("The number of duplicate elements in the array is: "+removeDuplicatesOptimal(arr));
        sc.close();
    }
}
