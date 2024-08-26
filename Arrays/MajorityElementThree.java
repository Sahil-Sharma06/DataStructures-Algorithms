import java.util.ArrayList;

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

