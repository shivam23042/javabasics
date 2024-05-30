public class 2darraysbas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no[][] = new int [4][5];
        /*
         For getting matrix Row = Matrix.length;
         For getting matrix columns = [0].matrix.length;
         */

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                no[i][j] = sc.nextInt();
            }
        }
        System.out.println();


        for(int i = 0; i < 4;i++){

            for(int j = 0; j < 5; j++){
                System.out.print(no[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
