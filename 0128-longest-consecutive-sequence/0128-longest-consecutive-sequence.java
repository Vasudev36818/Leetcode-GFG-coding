class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums) { set.add(i); }
        int max=1,max1=1;
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            int prev=nums[i]-1;
            max=1;
            if(!set.contains(prev)){
                while(set.contains(current+1)){
                    max++;
                    current++;
                }
                max1=Math.max(max,max1);
            }
        }   
        return max1;
    }
}