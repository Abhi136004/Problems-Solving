package Daily_problem.Top_150_Problems;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class Fre_duplicate_element_P73 {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,10,20,5,20};
        ArrayList<Integer> element = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(element.contains(arr[i])){
                int n = element.indexOf(arr[i]);
                count.set(n,count.get(n)+1);
            }
            else{
                element.add(arr[i]);
                count.add(1);
            }
        }
        for(int i = 0; i < count.size(); i++){
            if(count.get(i) > 2){
                System.out.println(element.get(i) + "--" + count.get(i));
            }
        }



//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < arr.length; i++){
//            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//        }
//        for(Map.Entry<Integer,Integer> entry  : map.entrySet()){
//            if(entry.getValue() > 1){
//                System.out.println(entry.getKey() + "--" + entry.getValue());
//            }
//        }
    }
}
