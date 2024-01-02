class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int count=0;
        List<List<Integer>> list = new ArrayList<>();
        while(count<nums.length)
        {
            List<Integer> l = new ArrayList<>();
               for(int i=0;i<nums.length;i++){
                   if(nums[i]!=-1 && !l.contains(nums[i])){
                       l.add(nums[i]);
                       nums[i]=-1;
                       count++;
                   }
               }
               list.add(l);
        }
      return list;

    }
}