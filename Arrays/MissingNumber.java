public class MissingNumber {
    // Bruteforce approach 
    static int findMissing(int[] arr, int n){
        for(int i = 1 ; i <= n ; i++){
            int flag = 0;
            for(int j = 0 ; j < n-1 ; j++){
                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }

    // Better Approach 

    public static int missingNumber(int []a, int N) {

        int hash[] = new int[N + 1];

        for (int i = 0; i < N - 1; i++)
            hash[a[i]]++;

        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) { 
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
