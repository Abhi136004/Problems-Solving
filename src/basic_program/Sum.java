package basic_program;

public class Sum {
    public static void main(String[] args){
        int a = 4567, sum = 0;
        while(a !=0 ){
            int last = a % 10;
            sum += last;
            a /= 10;
            if(a == 0 && sum <= 9){
                System.out.println(sum);
                break;
            }
            
            else if(a == 0 && sum > 9){
                a = sum;
                sum = 0;
            }
        }
    }
}
