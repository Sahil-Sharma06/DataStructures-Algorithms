import java.util.ArrayList;

public class LeadersInArray {

    // Bruteforce Approach 
    public static ArrayList<Integer> printLeadersBruteForce(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }

    // Optimal Approach 
    public static ArrayList<Integer> printLeadersOptimal(int[] arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(arr[n-1]);

        for(int i = n-2 ; i >= 0 ; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int n = 6;
        int arr[] = { 10, 22, 12, 3, 0, 6 };

        ArrayList<Integer> ans = printLeadersOptimal(arr, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
