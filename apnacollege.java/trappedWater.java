
    import java.util.*;
import java.math.*;


public class trappedWater {
    public static void main(String[] args) {
        int nums[] = {4,2,0,6,3,2,5};


        //copying bigger element from left
        int left[] = new int [nums.length];
        left[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            left[i] = Math.max(left[i -1], nums[i]);
        }

        //copying bigger element from right
        int right[] = new int [nums.length];
        right[nums.length -1] = nums[nums.length -1];
        for(int i = nums.length - 2; i >= 0; i--){
        right[i] = Math.max(right[i +1], nums[i]);
        }

        /* //printing element
        for(int i = 0; i < nums.length; i++){
            System.out.println(right[i]);
        }
 */
        //finding trapped water
        int trappedWater = 0;
        for(int i = 1; i < nums.length - 1;i++){

            int min = Math.min(left[i - 1], right[i+ 1]);
            trappedWater += Math.max(0, min - nums[i]);
             
        }
        System.out.println(trappedWater);
    }
}

