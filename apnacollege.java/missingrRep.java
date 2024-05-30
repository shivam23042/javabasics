public class missingrRep {
    public static void main(String[] args) {
        int a []= {8 ,4 ,1 ,6 ,7 ,2 ,5,8 };
        int arr[] = miss(a);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }public static int[] miss(int a[]){

        int twice = 0;
        int sum = 0;
        int sum2 = 0;
        for(int i =0; i < a.length;i++){
            for(int j = i+ 1; j < a.length;j++){
                 if(a[i] == a[j]){
                     twice = a[i];
                     break;
                 }
            }
        }for(int i = 1; i <= a.length;i++){
            sum += i;
        }for(int i = 0; i < a.length;i++){
            if(a[i] == twice){
                continue;
            }
            sum2 += a[i];
        }
        sum2 += twice;
        

        int arr []=  new int [2];

        arr[0] = twice;
        arr[1] = sum - sum2;

        return arr;

    }
    
}
