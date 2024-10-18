import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class singleNumber {

//    Bruteforce Approach
    public static int onlyNumberBrute(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return 0;
    }

//    Optimal Approach
    public static int onlyNumberOptimal(int[] nums){
        int n = nums.length;
        int XOR = 0;
        for(int i = 0 ; i < n ; i++){
            XOR ^= nums[i];
        }
        return XOR;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("The number appearing once in the array is :"+onlyNumberOptimal(nums));
    }
}
