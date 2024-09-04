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

    // public static int[] findMissingRepeatingNumbers(int[] a){

    // }


    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbersBetter(a);
        System.out.println("The repeating and missing numbers are: {"
                           + ans[0] + ", " + ans[1] + "}");
    }
}