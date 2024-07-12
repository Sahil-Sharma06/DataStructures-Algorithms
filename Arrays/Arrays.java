import java.util.Scanner;

// Optimal Solution
public class Arrays{
    public static int largestElement(int arr[]){
        int largest = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    System.out.println("Largest element in the array is : "+largestElement(arr));
    sc.close();
    }
}