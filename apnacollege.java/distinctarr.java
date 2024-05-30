public class distinctarr {

    public static void main(String[] args) {
        int no[] = {1,2,3};
        int nums[] = {2,4,6};

        printDistinct(no, nums);

    }
     public static void printDistinct(int no[], int nums[]){
     //making similar no from both array min
     for(int i = 0; i < no.length;i++){

        //checking from 2nd array
        for(int j = 0; j < nums.length;j++){

            if(no[i] == nums[j]){
                no[i] = Integer.MIN_VALUE;
                nums[j] = Integer.MAX_VALUE;
            }
        }
     }
     //copying no except min from no
     int start = 0;
    int noans[] = new int [no.length];
    for(int i = 0; i < no.length;i++){

        if (no[i] == Integer.MIN_VALUE) {
            continue;
        }else{
           noans[start] = no[i];
           start++;
        }
    }
    //copying no except min from nums
     start = 0;
    int numsans[] = new int [no.length];
    for(int i = 0; i < nums.length;i++){

        if (nums[i] == Integer.MIN_VALUE) {
            
            continue;
        }else{
            numsans[start] = nums[i];
            start++;
            continue;
        }
    }

    //printing no element
    for(int i =0; i < noans.length;i++){
        System.out.println(noans[i]);
    }

    System.out.println("nums ans ->" + " ");

    for(int i = 0; i < numsans.length;i++){
        System.out.println(numsans[i] + " j");
    }
}
    
}
