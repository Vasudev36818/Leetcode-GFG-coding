class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        Arrays.sort(nums);
        int j=0;
        int max=1;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<nums.length;i++)
        {
            if((nums[i]-nums[j])==1)
            {
                arr.add(nums[j]);
                j++;
                max=Math.max(arr.size()+1,max);
            }
            else if(nums[i]-nums[j]==0)
            {j++;
             continue;}
            else
            {
               arr.clear();
               j++;
            }
        }
        return max;
        
    }
}