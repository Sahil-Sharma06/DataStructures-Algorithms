import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class divisorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for(int i = 1 ; i*i <= n ; i++){
            if(n % i == 0)
                lst.add(i);

            if(n/i != i)
                lst.add(n/i);
        }

        System.out.println(lst);
    }
}
