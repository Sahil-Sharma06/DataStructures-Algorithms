import java.util.Arrays;

public class Knapsack01 {
    public int knapsack01(int[] wt, int[] val, int n, int W) {
        int[][] dp = new int[n][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return func(n - 1, W, wt, val, dp);
    }

    int func(int index, int W, int[] wt, int[] val, int[][] dp) {
        if (index == 0) {
            if (wt[0] <= W) return val[0];
            return 0;
        }
        if (dp[index][W] != -1) return dp[index][W];
        int notTake = func(index - 1, W, wt, val, dp);
        int take = Integer.MIN_VALUE;
        if (wt[index] <= W) {
            take = val[index] + func(index - 1, W - wt[index], wt, val, dp);
        }

        return dp[index][W] = Math.max(take, notTake);
    }

    public static void main(String[] args) {
        Knapsack01 solver = new Knapsack01();

        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        int capacity = 7;
        int n = weights.length;

        int maxValue = solver.knapsack01(weights, values, n, capacity);
        System.out.println("Maximum value that can be taken in knapsack = " + maxValue);
    }
}
