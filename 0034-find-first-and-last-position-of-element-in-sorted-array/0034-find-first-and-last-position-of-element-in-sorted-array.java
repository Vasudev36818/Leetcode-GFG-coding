class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int i=0,j=nums.length-1;
        boolean flag1=false, flag2=false;

        while(i<=j){
            if(nums[i]==target)
            {
               arr[0]=i;
               flag1=true;
            }
            if(nums[j]==target)
            {
                arr[1]=j;
                flag2=true;
            }
            if(flag1==false) i++;
            if(flag2==false) j--;
            
            if(flag1 && flag2) break;
        }
        if(!flag1 && flag2) arr[0]=arr[1];
        if(flag1 && !flag2) arr[1]=arr[0];
        return arr;
        
    }
}