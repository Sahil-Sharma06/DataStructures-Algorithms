public class FindRepeatingAndMisssingNumber{

    // Bruteforce Approach 
    static int[] findMissingRepeatingNumbers(int[] a){
        int n = a.length;
        int repeating = -1,missing = -1;

        for(int i = 1 ; i <= n ; i++){
            int count = 0;
            for(int j = 0; j < n ; j++){
                if(a[j] == i) count++;
            }
            if(count == 2) repeating = i;
            else if(count == 0) missing = i;

            if(repeating != -1 && missing != -1)
            break;
        }
        int[] ans = {repeating, missing};
        return ans;
    }

    // Better Approach

    public static int[] findMissingRepeatingNumbersBetter(int[] a){
        int n = a.length;
        int[] hash = new int[n+1];

        for(int i = 0 ; i < n ; i++){
            hash[a[i]]++;
        }

        int repeating = -1,missing = -1;
        for(int i = 1; i <= n ; i++){
            if(hash[i] == 2) repeating = i;
            else if(hash[i] == 0) missing = i;

            if(repeating != -1 && missing != -1)
            break;
        }
        int[] ans = {repeating, missing};
        return ans;
    }

    // Optimal Approach 1

    public static int[] findMissingRepeatingNumbersOptimal1(int[] a){
        int n = a.length;
        long SN = (n*(n+1))/2;
        long SN2 = (n*(n+1)*(2*n+1))/6;

        long S = 0, S2 = 0;
        for(int i = 0 ; i < n ; i++){
            S += a[i];
            S2 += (long)a[i] * (long)a[i];
        }

        long val1 = S-SN;
        long val2 = S2-SN2;
        val2 = val2/val1;

        long x = (val1+val2)/2;
        long y = x-val1;

        int[] ans = {(int)x,(int)y};
        return ans;
    }

    // Optimal Approach 2

    public static int[] findMissingRepeatingNumbersOptimal2(int[] a) {
        int n = a.length;
        int xr = 0;
    
        for (int i = 0; i < n; i++) {
            xr = xr ^ a[i];
            xr = xr ^ (i + 1);
        }
    
        int number = (xr & ~(xr - 1));
    
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            if ((a[i] & number) != 0) {
                one = one ^ a[i];
            } else {
                zero = zero ^ a[i];
            }
        }
    
        for (int i = 1; i <= n; i++) {
            if ((i & number) != 0) {
                one = one ^ i;
            } else {
                zero = zero ^ i;
            }
        }
    
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == zero) cnt++;
        }
    
        if (cnt == 2) return new int[] {zero, one};
        return new int[] {one, zero};
    }
    
    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbersOptimal2(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
    }
}