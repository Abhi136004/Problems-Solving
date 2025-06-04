package important;
import java.util.Scanner;

public class richest{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
    
            }
        }
        System.out.println(Richestcustomerwealth(arr));
        in.close();
    }
    public static int Richestcustomerwealth(int[][] acc) {
        int max = 0;

        for(int i = 0; i < acc.length; i++){
            int sum = 0;
            for(int j = 0; j < acc[i].length; j++){
                sum += acc[i][j];
            }
            if(sum > max)
            max = sum;
        }
        return max;

    }
}