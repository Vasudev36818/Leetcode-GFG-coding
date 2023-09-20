class Solution {
    public int minOperations(int[] nums, int x) {
        int total_sum=0;

        for(int i : nums){
            total_sum+=i;
        }

        int req_sum=total_sum - x;
        
        if(total_sum == x) return nums.length;

        int start=0,end=0,sum=0;
        int answer=0;

        while(end<nums.length){
            sum+=nums[end];

            while(start<end && sum>req_sum){
                sum-=nums[start++];
            }

            if(sum == req_sum)
            {
                 answer=Math.max(answer,end-start+1);
            }
            end++;
        }  
        if(answer==0) return -1;      
        answer=nums.length-answer;
        return answer;
        
    }
}