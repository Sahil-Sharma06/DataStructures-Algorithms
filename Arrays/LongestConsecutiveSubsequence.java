import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class LongestConsecutiveSubsequence {

    // Bruteforce Approach 
    public static int longestSubsequence(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        int count = 1;
        int longest = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i]-1 == lastSmaller){
                count+=1;
                lastSmaller = arr[i];
            }else if(arr[i] != lastSmaller){
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;

    }
    // Optimal Approach 

    public static int longestSubsequenceOptimal(int[] arr){
        int n = arr.length;
        if(n==0) return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            set.add(arr[i]);
        }

        for(int it : set){
            if(!set.contains(it-1)){
                int count = 1;
                int x = it;
                while(set.contains(x+1)){
                    x +=1;
                    count += 1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;

    }
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSubsequence(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
