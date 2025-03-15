import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isPresent(arr,0, 5));
    }

    static boolean isPresent(int[] arr, int index, int target){
        if(index == arr.length) return false;
        return arr[index] == target || isPresent(arr,index+1, target);
    }
}
