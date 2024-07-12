import java.util.*;
public class ReverseArray {

    public static void reverseArrayTwo(int[] arr, int l, int h){
        if(l >= h){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[h];
        arr[h] = temp;

        reverseArrayTwo(arr, l+1, h-1);

    }

    public static void reverseArrayOne(int[] arr, int l,int n){
        if(l>=n/2){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[n-l-1];
        arr[n-l-1] = temp;

        reverseArrayOne(arr, l+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed Array:");
        // reverseArrayTwo(arr,0,n-1);
        reverseArrayOne(arr, 0, n);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
