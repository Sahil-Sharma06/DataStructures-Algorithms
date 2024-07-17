import java.util.*;
public class UnionOfSortedArrays {
    static ArrayList<Integer> unionOfSortedArrays(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length ; i++){
            set.add(arr2[i]);
        }

        for(int x: set){
            Union.add(x);
        }

        return Union;
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

        ArrayList<Integer> Union = unionOfSortedArrays(arr1, arr2);
        for(int x: Union){
            System.out.print(x+" ");
        }
    sc.close();
    }
}
