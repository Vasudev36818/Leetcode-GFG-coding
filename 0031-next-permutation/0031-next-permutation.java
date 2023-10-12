class Solution {
    public void nextPermutation(int[] nums) {
         int gpoint=0;
         for(int i=nums.length-1;i>0;i--){
             if(nums[i]>nums[i-1]){
             gpoint=i;
             break;
            }
         }
         if(gpoint==0) Arrays.sort(nums);
         else{
            int min=Integer.MAX_VALUE;
            int swap_num=nums[gpoint-1];
            for(int j=gpoint;j<nums.length;j++){
                if(nums[j]-swap_num>0 && nums[j]-swap_num<min)
                {
                    int temp=nums[j];
                    nums[j]=nums[gpoint-1];
                    nums[gpoint-1]=temp;
                }
            }
            Arrays.sort(nums,gpoint,nums.length);
           
         }
    }
}