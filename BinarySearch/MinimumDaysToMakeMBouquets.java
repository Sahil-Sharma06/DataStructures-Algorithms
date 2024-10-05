public class MinimumDaysToMakeMBouquets{

    // Bruteforce approach 
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; 
        int cnt = 0;
        int noOfB = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }

    public static int minimumDays(int[] arr, int k, int m) {
        long val = (long) m * k;
        int n = arr.length;
        if (val > n) return -1;
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        for (int i = mini; i <= maxi; i++) {
            if (possible(arr, i, m, k))
                return i;
        }
        return -1;
    }

    // Optimal Approach 

    public static int minimumDaysOptimal(int[] arr, int k, int m) {
        long val = (long) m * k;
        int n = arr.length; 
        if (val > n) return -1; 
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        int low = mini, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(arr, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = minimumDaysOptimal(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}