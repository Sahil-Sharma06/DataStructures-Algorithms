import java.util.HashMap;
public class CountNumberOfSubArrayEqualsK {

    // Bruteforce and better approach 
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; 
        int cnt = 0;

        for (int i = 0 ; i < n; i++) { 
            int sum = 0;
            for (int j = i; j < n; j++) { 
                sum += arr[j];
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;
    }

    // Optimal Approach 
    public static int findAllSubarraysWithGivenSumOptimal(int arr[], int k) {
        int n = arr.length; 
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); 
        for (int i = 0; i < n; i++) {
            preSum += arr[i];

            int remove = preSum - k;

            cnt += mpp.getOrDefault(remove, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSumOptimal(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
