package important;

import java.util.Arrays;

class MaximumOfMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 9, 9, 8, 1 }, { 5, 6, 2, 6 }, { 8, 2, 6, 4 }, { 6, 2, 2, 2 } };

        int[][] ans = largestLocal(arr);
        for (int[] arr1 : ans) {
            System.out.println(Arrays.toString(arr1));

        }
    }

    static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];

        for (int i = 0; i < n-2; i++) {
            
            for (int j = 0; j < n-2; j++) {
                
                int[][] range = new int[3][3];
                int r = 0;
                for (int k = i; k < i+3; k++) {
                    int c = 0;
                    for (int l = j; l < j+3; l++) {
                        range[r][c] = grid[k][l];
                        c++;
                    }
                    r++;
                }
                ans[i][j] = max(range);
            }
        }
        return ans;
    }

    static int max(int[][] grid) {
        int max = grid[grid.length - 1][grid.length - 1];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
        }
        return max;
    }

}