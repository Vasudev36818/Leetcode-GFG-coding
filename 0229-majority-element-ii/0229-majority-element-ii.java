class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1=-1,e2=-1,count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e1) count1++;
            else if(nums[i]==e2) count2++;
            else if(count1==0)
            {
                e1=nums[i];
                count1=1;
            }
            else if(count2==0)
            {
                e2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
            ArrayList<Integer> list=new ArrayList<>();
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e1) count1++;
            else if(nums[i]==e2) count2++;
        }
        if(count1>nums.length/3) list.add(e1);
            if(count2>nums.length/3) list.add(e2);
        return list;
    }
}