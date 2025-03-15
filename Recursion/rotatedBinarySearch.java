import java.util.Scanner;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(rotatedBS(arr,5,0,n-1));
    }

    static boolean rotatedBS(int[] arr, int target, int start, int end){
        if(start > end) return false;

        int mid = start + (end-start)/2;
        if(arr[mid] == target) return true;

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return rotatedBS(arr,target,start,mid-1);
            }else{
                return  rotatedBS(arr,target,mid+1,end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]){
            return rotatedBS(arr,target,mid+1,end);
        }
        return rotatedBS(arr,target,start,mid-1);
    }
}
