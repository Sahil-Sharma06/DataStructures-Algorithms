import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class RearrangeArray {

    // Bruteforce Approach

    static int[] rearrangeArray(int[] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }

        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }

        return arr;
    }

    // Optimal Approach 
    static ArrayList<Integer> rearrangeArrayOptimal(ArrayList<Integer> arr){
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int posIndex = 0, negIndex = 1;
        for(int i = 0 ; i < arr.size() ; i++){
            if(arr.get(i) < 0){
                ans.set(negIndex, arr.get(i));
                negIndex+=2;
            }else{
                ans.set(posIndex, arr.get(i));
                posIndex+=2;
            }
        }
        return ans;
    }

    // Variety 2 Question 

    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }

        if (pos.size() < neg.size()) {

            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }

        else {
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }

            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        // int n = 4;
        // ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        // ArrayList<Integer> ans = rearrangeArrayOptimal(A);

        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.print(ans.get(i) + " ");
        // }

        int n = 6;
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));

        ArrayList<Integer> ans = RearrangebySign(A, n);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
