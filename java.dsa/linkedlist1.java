import java.util.Scanner;

public class linkedlist1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a<b&&b<c){
                System.out.print("STAIR ");
            }else if(a<b&&b>c){
                System.out.print("PEAK ");
            }else{
                System.out.print("NONE ");
            }
            System.out.println();
        }
        sc.close();
    }
}