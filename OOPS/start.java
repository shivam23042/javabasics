import java.util.*;
public class start{
    public static void main(String[] args) {
        int n = 4;
        int an = fib(n);
        System.out.println(an);
        

    }

    public static int fib(int n){
        if(n <= 0){
            return 0;
        }if(n == 1){
            return 1;
        }
    
        int ans = fib(n-1) + fib(n -2) + fib(n -3);
    
        return ans;
    }
}
