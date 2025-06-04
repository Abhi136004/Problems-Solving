package pattern;

public class pattern_6 {
    public static void main(String[] args){
        int n = 4;
        int a = 0;
        
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                for(int j = 1; j <=i; j++){
                    char ch1 = (char)('A' + a);
                    char ch2 = (char)('a' + a);
                    if(j%2 != 0){
                        System.out.print(ch1 + " ");
                    }
                    else{
                        System.out.print(ch2 + " ");
                    }
                    a++;
                }
                System.out.println();
            }
            else{
                for(int j = 1; j <=i; j++){
                    char ch1 = (char)('A' + a);
                    char ch2 = (char)('a' + a); 
                    if(j%2 == 0){
                        System.out.print(ch1 + " ");
                    }
                    else{
                        System.out.print(ch2 + " ");
                    }
                    a++;
                }
                System.out.println();  
            }
        }
        
    }
    
}
