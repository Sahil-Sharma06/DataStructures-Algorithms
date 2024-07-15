import java.util.Scanner;

public class LeftRotateByDPlaces {

    public static void reverseArray(int[] arr,int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Bruteforce Approach 
    public static void rotateArrayByDPlaces(int[] arr,int d){
        d = d%arr.length;
        int[] temp = new int[d];
        for(int i = 0 ; i < d ; i++){
            temp[i] = arr[i];
        }

        for(int i = d ; i < arr.length ; i++){
            arr[i-d] = arr[i];
        }

        int j = 0;
        for(int i = arr.length-d ; i < arr.length ; i++){
            arr[i] = temp[j];
            j++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Optimal Approach 

    public static void rotateArrayByDPlacesOptimal(int[] arr, int d, int start,int end){
        reverseArray(arr, start, d-1);
        reverseArray(arr, d, end);
        reverseArray(arr, start, end);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations: ");
        int d = sc.nextInt();

            // rotateArrayByDPlaces(arr, d);
            rotateArrayByDPlacesOptimal(arr, d, 0, n-1);

        sc.close();
    }
}
