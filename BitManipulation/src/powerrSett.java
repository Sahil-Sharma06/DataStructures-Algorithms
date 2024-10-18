public class powerrsett {
    public static List<List<Integer>> func(int[] nums){
        int n = nums.length;
        int subsets = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < subsets ; i++){
            List<Integer> lst = new ArrayList<>();
            for(int j = 0 ; j < n ; j++){
                if((i & (1 << j)) != 0){
                    lst.add(nums[j]);
                }
            }
            ans.add(lst);
        }
        return ans;
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0 ; i < n ; i++){
        nums[i] = sc.nextInt();
    }
    List<List<Integer>> ans = new ArrayList<>();
    ans = powerrsett.func(nums);
    System.out.println("The powerset of nums is :"+ans);

}
