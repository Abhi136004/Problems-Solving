package basic_program;
class SquareRoot{
    public static void main(String[] args){
        System.out.println(mySqrt(2147395599));
    }
    static int mySqrt(int x) {
        if(x < 2){
         return x;
        } 
 
        int i = 1; 
        int j = x;
 
        while(i <= j){
         int mid = i + (j - i)/2;
 
         if(mid * mid == x){
             return mid;
         }
 
         else if((long)mid * mid > x){
             j = mid -1;
         }
         else{
             i = mid + 1;
         }
        }
        return j;
     }
}