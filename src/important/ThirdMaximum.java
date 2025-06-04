package important;
class Thirdmaximum{
    public static void main(String[] args){
        int[] arr = {8,8,8,8, 8, 8};
        System.out.println(Maximum(arr));
    }
    static int Maximum(int[] arr){
        if(arr.length < 3){
            return Math.max(arr[0] , arr[1]);
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= first && arr[i] > second && arr[i] > third){
                
                third = second;
                second = first;
                first = arr[i];
                
            }
            else if(arr[i] >= second && arr[i] < first && arr[i] > third){
                third = second;
                second = arr[i];
                
            }
            else {
                if(arr[i] >= third  && arr[i] < first && arr[i] < second){
                    third = arr[i];
                }

            }
        }
        return third;
    }
}