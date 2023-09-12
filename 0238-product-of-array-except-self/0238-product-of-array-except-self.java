class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod1=1,prod2=1,count=0;
        for(int i : nums)
        {
            if(i!=0) prod1*=i;
            else {prod2=0; count++;}
        }
      
        for(int i=0;i<nums.length;i++)
        {   
            if(nums[i]==0 && count==1)
            nums[i]=prod1;
            else if(prod2!=0) nums[i]=prod1/nums[i];
            else nums[i]=0;
        }
        return nums;
        
    }
}