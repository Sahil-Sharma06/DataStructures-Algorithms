public class LastOccurence {

    public static int lastOccurence(int[] arr,int n,int key){
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                ans = mid;
                low = mid+1;
            }else if(key < arr[mid]){
                high = mid-1;
            }else{
                high = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 7;
        int key = 13;
        int[] arr = {3,4,13,13,13,20,40};

        System.out.println(lastOccurence(arr, n, key));
    }
}
