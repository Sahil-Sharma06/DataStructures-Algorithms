import java.util.Scanner;
public class xorInAGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("The xor till n is : "+inRangeOptimal(4,7));
    }

//    Bruteforce Approach
    private static int xorBrute(int n) {
        int xor = 0;
        for(int i = 1 ; i <= n ; i++) {
            xor ^= i;
        }
        return xor;
    }

//    Optimal Approach
    private static int xorOptimal(int n){
        if(n % 4 == 1)
            return 1;
        else if(n % 4 == 2)
            return n+1;
        else if(n % 4 == 3)
            return 0;
        else
            return n;
    }

//    In a Given Range (l,r)
    private static int inRangeBrute(int l, int r){
        for(int i = l ; i <= r ; i++){
            l ^= r;
        }

        return l;
    }

//    Optimal Approach
    private static int inRangeOptimal(int l, int r){
        int res = inRangeBrute(1,l-1) ^ inRangeBrute(1,r);

        return res;
    }
}

