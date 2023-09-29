class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean flag=true;
        boolean equal=true,flag1=false;

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) flag=false;
            if(nums[i-1]!=nums[i]) equal=false;
        }
           for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]) flag1=true;
        }
        if(equal==true) return true;
        if(flag==flag1) return true;
        return false;
    }
}