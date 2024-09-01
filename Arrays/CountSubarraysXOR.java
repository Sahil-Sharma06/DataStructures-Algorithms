import java.util.HashMap;
public class CountSubarraysXOR{

    // Bruteforce Approach
    static int subarraysWithXorKBrute(int [] a, int k){
        int n = a.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int xor = 0;
                for(int K = i ; K <= j ; K++){
                    xor ^= a[K];
                }

                if(xor == k){
                    count++;
                }
            }
        }
        return count;
    }

    // Better Approach 
    public static int subarraysWithXorKBetter(int []a, int k) {
        int n = a.length; 
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int xorr = 0;
            for (int j = i; j < n; j++) {

                xorr = xorr ^ a[j];

                if (xorr == k) cnt++;
            }
        }
        return cnt;
    }

    // Optimal Approach 
    public static int subarraysWithXorKOptimal(int []a, int k){
        int n = a.length;
        int xr = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(xr,1);
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            xr = xr^a[i];
            int x = xr^k;
            if(mpp.containsKey(x)){
                count += mpp.get(x);
            }

            if(mpp.containsKey(xr)){
                mpp.put(xr,mpp.get(xr)+1);
            }else{
                mpp.put(xr,1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        int ans = subarraysWithXorKOptimal(a, k);
        System.out.println("The number of subarrays with XOR k is: " + ans);
    }
}