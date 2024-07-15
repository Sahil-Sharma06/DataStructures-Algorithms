import java.util.Scanner;
public class Array{
    public static int secondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = -1;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest){
                if(arr[i] > secondLargest){
                    secondLargest = arr[i];
                }
            }
        }

        return secondLargest;
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
    System.out.println("Second Largest element in the array is : "+secondLargest(arr));
    sc.close();
    }
}