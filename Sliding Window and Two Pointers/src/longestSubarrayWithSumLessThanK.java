public class longestSubarrayWithSumLessThanK {

//    Bruteforce Approach
    static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum <= k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxLength;
    }

//    Better Approach
    static int longSubArrayBetter(int[] arr, int k) {
        int n = arr.length;
        int l = 0, r = 0;
        int currSum = 0, maxLength = 0;
        while (r < n) {
            currSum += arr[r];
            while (currSum > k) {
                currSum -= arr[l];
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }

//    Optimal Approach
    static int LongSubArraySumOptimal(int[] arr, int k) {
        int n = arr.length;
        int l = 0, r = 0;
        int currSum = 0, maxLength = 0;
        while (r < n) {
            currSum += arr[r];
            if (currSum > k) {
                currSum -= arr[l];
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 1, 2, 1, 5, 1};
        int k = 7;

        int resultBruteForce = longestSubarray(arr, k);
        System.out.println("Brute Force Result: " + resultBruteForce);

        int resultBetter = longSubArrayBetter(arr, k);
        System.out.println("Better Approach Result: " + resultBetter);

        int resultOptimal = LongSubArraySumOptimal(arr, k);
        System.out.println("Optimal Approach Result: " + resultOptimal);
    }
}
