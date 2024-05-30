public class pattern{
    public static void main(String[] args) {
        int n = 7;
        int line  = 1;
        int space =n - 1;
        int star = 1;

        while(line <= n ){

            //printspace
            for(int i = 0; i < space;i++){
                System.out.print(" ");
            }
            //printingstars
            for(int i = 0; i < star; i++){
                System.out.print(line + " ");
            }
            space--;
            star++;
            line++;
            System.out.println();
        }
    }
}