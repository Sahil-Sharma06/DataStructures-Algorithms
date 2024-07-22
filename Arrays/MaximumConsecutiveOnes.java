public class MaximumConsecutiveOnes {
    static int MaxConsecutiveOnes(int[] a, int N){
        int maximum = 0;
        int count = 0;
        for(int i = 0 ; i < N ; i++){
            if(a[i] == 1){
                count++;
                maximum = Math.max(count, maximum);
            }else{
                count = 0;
            }
        }

        return maximum;
    }
    public static void main(String[] args) { 
        int N = 9;
        int a[] = {1, 1, 0, 1, 1, 1, 0, 1, 1};

        int ans = MaxConsecutiveOnes(a, N);
        System.out.println("The missing number is: " + ans);
    }
}
