class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0,i=0,j=0;
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]==val && nums[j]!=val)
            {
              int temp=nums[i];
              nums[i++]=nums[j];
              nums[j++]=temp;
              count++;
            }
            else if(nums[i]==val && nums[j]==val)
            j++;
            else if(nums[i]!=val)
            {
                i++; j++; count++;
            }   
        }
        return count;    
    }
}