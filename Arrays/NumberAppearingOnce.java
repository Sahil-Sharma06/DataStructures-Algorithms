public class NumberAppearingOnce {

    // BruteForce Approach 
    static int numberAppearingOnce(int[] arr,int N){
        for(int i = 0 ; i < N ; i++){
            int num = arr[i];
            int count = 0;
            for(int j = 0 ; j < N ; j++){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int n = 5;
        int ans = numberAppearingOnce(arr, n);
        System.out.println("The single element is: " + ans);

    }
}
