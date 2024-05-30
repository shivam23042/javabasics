public class copy {

  public static void main(String[] args) {
    int nums[] = {1,0,0,1,1,0,1,1,1};
    int Max_sum = 0;

    for(int i = 0; i < nums.length -1; i++){
      int sum = nums[i];

      for(int j = i + 1; j < nums.length;j++){

        if(nums[i] != nums[j]){
          break;
        }else if(nums[i] == nums[j]){
          sum += nums[j];
        }
      }
      Max_sum = Math.max(sum,Max_sum);

    }
    System.out.println(Max_sum);
  }
}