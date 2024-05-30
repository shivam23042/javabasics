public class insertpos {

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        int target = 7;

        System.out.println(pos(arr, target));





    }  public static int pos(int arr [],int target){
        int start = 0; 
        int end = arr.length - 1;
        int ret = 0;


        if(target > arr[end]){
            return arr.length;
        }

        for(int i = 0; i < arr.length;i++){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                ret = mid - 1;
                end = mid - 1;
            }else{
                start =  mid + 1;
                ret = mid + 1;
            }

        }
        return ret;
    }
    
}
