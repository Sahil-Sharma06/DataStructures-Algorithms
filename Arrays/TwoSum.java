import java.util.*;
import java.util.Arrays;
public class TwoSum {

    // Bruteforce Approach 
    static String TwoSumEqualsTraget(int arr[], int n, int target){
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] + arr[j] == target){
                    return "YES";
                }
            }
        }

        return "NO";
    }

    // Better Approach 
    static String TwoSumEqualsTragetBetter(int[] arr, int n, int target){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int num = arr[i];
            int moreNeeded = target - num;
            if(mpp.containsKey(moreNeeded)){
                return "YES";
            }
            mpp.put(arr[i],i);
        }
        return "NO";
    }

    // Optimal Approach 
    static String TwoSumEqualsTragetOptimal(int[] arr, int n, int target){
        Arrays.sort(arr);
        int left = 0, right = n-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target) return "YES";
            else if(sum < target) left++;
            else right--;
        }

        return "NO";

    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        String result = TwoSumEqualsTragetBetter(a, 5, 14);
        System.out.println(result);
    }
    
}
