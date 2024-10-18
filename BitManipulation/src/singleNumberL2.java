import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class singleNumberL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("The number appearing once in the array is :" + onlyNumberL2Optimal2(nums));
    }

//    Bruteforce Approach
    private static int onlyNumberL2Brute(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();;
        }

        return 0;
    }

//    Optimal Approach
    private static int onlyNumberL2Optimal(int[] nums){
        int n = nums.length;
        int ans = 0;
        int count = 0;
        for(int bitIndex = 0 ; bitIndex < 32 ; bitIndex++)
            for(int j = 0 ; j < n-1 ; j++){
                if((nums[j] & ( 1 << bitIndex)) != 0){
                    count++;
                }
                if(count % 3 == 0){
                    ans = ans | (1 << bitIndex);
                }
            }
        return ans;
        }

//        Optimal Approach 2

    private static int onlyNumberL2Optimal2(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 1 ; i < n ; i += 3){
            if(nums[i] != nums[i-1])
                return nums[i-1];
        }
        return nums[n-1];
    }

}


