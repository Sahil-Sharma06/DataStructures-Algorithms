import java.util.*;

public class MajorityElement {

    // Bruteforce Approach 
    public static int majorityElement(int []v) {
        int n = v.length;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (v[j] == v[i]) {
                    cnt++;
                }
            }

            if (cnt > (n / 2))
                return v[i];
        }

        return -1;
    }

    // Better Approach 

    public static int majorityElementBetter(int []v) {
        int n = v.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }

        return -1;
    }

    // Optimal Approach 
    public static int majorityElementOptimal(int []v) {
        int n = v.length;
        int cnt = 0; 
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
