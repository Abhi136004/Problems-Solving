package important;
import java.util.Arrays;
public class Temperature {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] dailyTemperatures(int[] temp) {

        int[] ans = new int[temp.length];
        int i = 0;
        while (i < temp.length) {
            int count = 0;

            for (int j = i + 1; j < temp.length; j++) {
                if (j == temp.length-1 && temp[j] <= temp[i]) {
                    count = 0;
                    break;
                }
                if (temp[j] > temp[i]) {
                    count++;
                    break;
                }

                else {
                    count++;
                }

            }
            ans[i] = count;
            i++;
        }
        return ans;

    }
}