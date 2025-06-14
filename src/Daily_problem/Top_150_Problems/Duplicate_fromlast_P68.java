package Daily_problem.Top_150_Problems;
import java.util.HashMap;
public class Duplicate_fromlast_P68 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,4,2,5,6,1};

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxDist = 0;
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int firstIndex = map.get(arr[i]);
                int distance = i - firstIndex;
                if (distance > maxDist) {
                    maxDist = distance;
                    result = arr[i];
                }
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println(result + " --> " + maxDist);

//        int n = -1;
//        int dist = 0;
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[i] == arr[j] && (j-i) > dist){
//                    dist = j-i;
//                     n = arr[i];
//                }
//            }
//        }
//        System.out.println(n + "-->" + dist);






    }
}
