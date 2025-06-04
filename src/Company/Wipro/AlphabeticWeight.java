package Company.Wipro;

public class AlphabeticWeight {
    public static void main(String[] args){
        int[] arr = {15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,
                     67,12,0,13,2,3,43,21,-17,2,42};
        String str = "Wipro Limited";
        System.out.println(Weight(arr,str));
    }

    static int Weight(int[] arr, String str) {
        str = str.toLowerCase();
        String[] s = str.split(" ");
        int weight = 1;
        for(int i = 0 ; i < s.length; i++){
            int sum = 0;
            for(int j = 0; j < s[i].length(); j++){
                int n  = (int) s[i].charAt(j)-'a';
                int value = arr[n];
                if((j == 0 || j == s[i].length()-1) && (value < 0)){
                    value = value + n+1;
                }
                sum += value;
            }
            weight *= sum;
        }
        return weight;
    }
}
