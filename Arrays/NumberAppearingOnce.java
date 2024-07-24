import java.util.HashMap;
import java.util.Map;

public class NumberAppearingOnce {

    // BruteForce Approach 
    static int numberAppearingOnce(int[] arr,int N){
        for(int i = 0 ; i < N ; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0 ; j < N ; j++){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1){
                return num;
            }
        }
        return -1;
    }

    // Better Approach 01 
    static int numberAppearinOnceBetter01(int[] arr,int n){
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
        return -1;
    }

    // Better Approach 02

    static int numberAppearingOnceBetterTwo(int[] arr, int n){
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }

    static int numberAppearingOnceOptimal(int [] arr, int n){
          int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int n = 5;
        int ans = numberAppearingOnce(arr, n);
        System.out.println("The single element is: " + ans);

    }
}
