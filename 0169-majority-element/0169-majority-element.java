class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums)
       {
           map.put(i,map.getOrDefault(i,0)+1);
       }

       int max=0,count=0;
       for(int i=0;i<nums.length;i++)
       {
           if(count<map.get(nums[i]))
           {count=map.get(nums[i]);
           max=nums[i];}
       }
       return max;
        
    }
}