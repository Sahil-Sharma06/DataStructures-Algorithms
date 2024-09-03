import java.util.Arrays;
import java.util.*;
public class MergeOverlappingSubIntervals {

    public static ArrayList<ArrayList<Integer>> mergeOverlappingBrute(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            int start = arr[i][0];
            int end = arr[i][1];

            if(!ans.isEmpty() && end <= ans.get(ans.size() -1).get(1)){
                continue;
            }

            for(int j = i ; j < n ; j++){
                if(arr[j][0] < end){
                    end = Math.max(end,arr[j][1]);
                }else{
                    break;
                }
            }

            ans.add(new ArrayList<>(Arrays.asList(start,end)));
        }

        return ans;
    }
    public static void main(String[] args) {
         int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        ArrayList<ArrayList<Integer>> ans = mergeOverlappingBrute(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
