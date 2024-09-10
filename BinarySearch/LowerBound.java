public class LowerBound {

    public static int getLowerBound(int[] arr,int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low + (high-low) / 2;

            if(arr[mid] < target){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        int ind = getLowerBound(arr, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
