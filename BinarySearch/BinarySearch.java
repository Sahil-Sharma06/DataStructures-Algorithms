public class BinarySearch{

    public static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(arr[mid] == target)
            return mid;
            if(arr[mid] < target)
            low = mid+1;
            else
                high = mid-1;    
        }
        return -1;
    }

    // Recursive Approach 
    public static int binarySearchRecursive(int[] arr,int low, int high,int target){
        if(low > high) return -1;
        int mid = (low + high) / 2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target)   return binarySearchRecursive(arr, mid+1,high,target);
        else   return binarySearchRecursive(arr, low, mid-1, target);

    }
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int n = a.length-1;
        int target = 6;
        int ind = binarySearchRecursive(a,0,n, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}