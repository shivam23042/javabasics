import java.util.Scanner;

public class maths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        
        algebra mat = new algebra();
        
            int a = sc.nextInt();
            int b = sc.nextInt();
            mat.add(a,b);
            System.out.println(mat.addition);
    }     
            
}

class algebra{

    protected int addition;
    int multiplication;
    int division;
    int subtraction;


    int getadd(){
        return this.addition;
    }
 
    int add(int a , int b){
        addition = a + b;
        return addition;
    }
    
}