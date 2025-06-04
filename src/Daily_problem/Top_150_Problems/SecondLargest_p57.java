package Daily_problem.Top_150_Problems;

public class SecondLargest_p57 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 100};
        int max = arr[0];
        int smax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax) {
                smax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
