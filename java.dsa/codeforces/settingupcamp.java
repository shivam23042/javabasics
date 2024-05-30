

import java.util.Scanner;

public class settingupcamp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
     
    int ans = setup(t);
    System.out.println(ans);
    

    
}
public static int setup(int t){

    Scanner sc = new Scanner(System.in);
    

    while(t-->0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        
        if(b % 3 == 0 || (c + b ) % 3 == 0){
         if((c + b) % 3 == 0 ){
            sum = a + (c+ b) / 3;
         }if((c + b) % 3 == 1 || (c+ b) % 3 == 2){
            sum = a + (c + b)  / 3 + 1;
         }
         
         return sum;
            
        }
    }
    return -1;

}
}