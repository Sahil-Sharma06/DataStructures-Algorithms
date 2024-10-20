import java.util.*;

public class twoDistinctNumbers {
    private static List<Integer> onlyNumberL2Brute(int[] nums){
        Map<Integer,Integer> mpp = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry: mpp.entrySet()){
            if(entry.getValue() == 1)
                lst.add(entry.getKey());
        }

        return lst;

    }

    private static List<Integer> onlyNumberL2Optimal(int[] nums){
        List<Integer> lst = new ArrayList<>();
        long xor = 0;
        for(int i = 0 ; i < nums.length ; i++){
            xor ^= nums[i];
        }

        long rightMost = (xor ^ (xor-1)) & xor;
        int b1 = 0, b2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if((nums[i] & rightMost) != 0){
                b1 ^= nums[i];
            }else{
                b2 ^= nums[i];
            }
        }

        lst.add(b1);
        lst.add(b2);
        return lst;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("The number appearing once in the array is :" + onlyNumberL2Brute(nums));
    }
}
