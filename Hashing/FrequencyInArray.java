import java.util.*;


public class FrequencyInArray{
    
    private static int hashArr[] = new int[100000000];
    // Arrays.fill(hashArr, 0);

    static{
        Arrays.fill(hashArr, 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }


        for(int i = 0 ; i < n ; i++){
            hashArr[arr[i]] += 1;
        }

        System.out.println("Enter the number of queries");
        int query;
        query = sc.nextInt();
        System.out.println("Frequencies are: ");
        while(query>= 0){
            int num = sc.nextInt();
            System.out.println(hashArr[num]);
            query--;
        }

        sc.close();
    }
}