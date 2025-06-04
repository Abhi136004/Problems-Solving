package important;
import java.util.ArrayList;
public class Union_Except_Intersect {
    public static void main(String[] args){
        int[] arr1 = {1,2,5,3,8,9};
        int[] arr2 = {1,7,5,8,8};

        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> except = new ArrayList<>();
        ArrayList<Integer> intersect = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            union.add(arr1[i]);
            if(arr1[i] % 2 == 0){
                except.add(arr1[i]);
            }
        }
        for(int j = 0; j < arr2.length; j++){
            if(!union.contains(arr2[j])){
                union.add(arr2[j]);
            }
            else{
                if(!intersect.contains(arr2[j])){
                    intersect.add(arr2[j]);
                }
            }
            if(arr2[j] % 2 != 0){
                except.add(arr2[j]);
            }
        }
        System.out.println(union);
        System.out.println(except);
        System.out.println(intersect);
    }
}
