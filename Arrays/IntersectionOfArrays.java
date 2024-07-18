import java.util.*;
public class IntersectionOfArrays {

    // Bruteforce Approach 
    static ArrayList<Integer> intersection(int[] arr1, int[] arr2){
        int[] visited = new int[arr2.length];
        for(int i = 0 ; i < arr2.length ; i++){
            visited[i] = 0;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                if(arr1[i] == arr2[j] && visited[j] == 0){
                ans.add(arr1[i]);
                visited[j] = 1;
                break;
                }
                if(arr2[j] > arr1[i]){
                    break;
                }
            }
        }

        return ans;

    }

    // Optimal Approach 

    static ArrayList<Integer> intersectionOptimal(int[] arr1, int[] arr2){
        ArrayList<Integer> Ans = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        while(i < n && i < m){
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr2[j] < arr1[i]){
                j++;
            }else{
                Ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        return Ans;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        ArrayList<Integer> Ans = intersectionOptimal(arr1, arr2);
        for(int x: Ans){
            System.out.print(x+" ");
        }
    sc.close();
    }
}
