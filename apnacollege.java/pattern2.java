public class pattern2 {

    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int space = n -1;
        while (i <= n) {
            for(int k = 0; k < space; k++){
                System.out.print("  ");
            }

            for(int j = 0; j< 2*i -1; j++){
                if(j % 2 == 0){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
               
            }


            i++;
            System.out.println();
            space--;
               
            
        }
    }
}