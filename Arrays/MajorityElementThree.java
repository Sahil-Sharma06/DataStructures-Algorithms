import java.util.ArrayList;
import java.util.HashMap;
public class MajorityElementThree {

    // Bruteforce Approach 
    static ArrayList<Integer> majorityElement(int[] arr){
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            if(ls.size() == 0 || ls.get(0) != arr[i]){
                int count = 0;
                for(int j = 0; j < n ; j++){
                    if(arr[j] == arr[i]){
                        count++;
                    }
                }

                if(count > (n/2)){
                    ls.add(arr[i]);
                }
            }
            if(ls.size() == 2) break;
        }
        return ls;

    }

    // Better Approach 
    public static ArrayList<Integer> majorityElementBetter(int[] arr){
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();

        HashMap<Integer,Integer> mpp = new HashMap<>();

        int mini = (int)(n/3)+1;

        for(int i = 0; i < n ; i++){
            int val = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i],val+1);

            if(mpp.get(arr[i]) == mini){
                ls.add(arr[i]);
            }
            if(ls.size() == 2) break;
        }
        return ls;
    }

    public static ArrayList<Integer> majorityElementOptimal(int []v) {
    int n = v.length;

    int cnt1 = 0, cnt2 = 0;
    int el1 = Integer.MIN_VALUE;
    int el2 = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        if (cnt1 == 0 && el2 != v[i]) {
            cnt1 = 1;
            el1 = v[i];
        } else if (cnt2 == 0 && el1 != v[i]) {
            cnt2 = 1;
            el2 = v[i];
        } else if (v[i] == el1) cnt1++;
        else if (v[i] == el2) cnt2++;
        else {
            cnt1--; cnt2--;
        }
    }

    ArrayList<Integer> ls = new ArrayList<>();

    cnt1 = 0; cnt2 = 0;
    for (int i = 0; i < n; i++) {
        if (v[i] == el1) cnt1++;
        if (v[i] == el2) cnt2++;
    }

    int mini = (int)(n / 3) + 1;
    if (cnt1 >= mini) ls.add(el1);
    if (cnt2 >= mini) ls.add(el2);

    return ls;
}


        public static void main(String[] args) {
            int[] arr = {11, 33, 33, 11, 33, 11};
        ArrayList<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        }
}

