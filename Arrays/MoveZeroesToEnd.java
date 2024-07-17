import java.util.*;
public class MoveZeroesToEnd{

    // BruteForce Approach for the problem
    public static void moveZeroesToEnd(int[] arr, int n){
        List<Integer> temp = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        for(int i = 0 ; i < temp.size() ; i++){
            arr[i] = temp.get(i);
        }
        int noOfZeroes = temp.size();

        for(int i = noOfZeroes ; i < n ; i++){
            arr[i] = 0;
        }

        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }

    }

    // Optimal Approach for the problem

    public static void moveZeroesToEndOptimal(int[] arr,int n){
        int j = -1;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1 ; i < n ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
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

        moveZeroesToEndOptimal(arr,n);
    sc.close();
        
    }
}