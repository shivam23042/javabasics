public class sorted {

    public static void main(String[] args) {
        int arr[]  = {1,2,3,4};

        System.out.print(check(arr));
    }
    public static boolean check(int arr[]){

        int checking = 0;

        for(int i = 0; i < arr.length - 1;i++){
           if(arr[i] > arr[i + 1]){
            checking++;
           }
           System.out.println(checking);
        }
     
        if(arr[0] < arr[arr.length -1]){
            checking++;
        }
        System.out.println(checking);

        return checking <=1;
    }
}