import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumKPositive {
    // Bruteforce Approach
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; 

        int len = 0;
        for (int i = 0; i < n; i++) { 
            for (int j = i; j < n; j++) { 
                long s = 0;
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static int getLongestSubarrayTwoLoops(int []a, long k) {
        int n = a.length; 

        int len = 0;
        for (int i = 0; i < n; i++) { 
            long s = 0; 
            for (int j = i; j < n; j++) { 
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    // Better Approach 
    public static int getLongestSubarrayBetter(int []a, long k) {
        int n = a.length; 

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    // Optimal Approach 
    public static int getLongestSubarrayOptimal(int []a, long k) {
        int n = a.length; 

        int left = 0, right = 0; 
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }


    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
