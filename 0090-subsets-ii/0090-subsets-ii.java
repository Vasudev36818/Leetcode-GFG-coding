class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();

        find(0,nums,new ArrayList<>(),list);
        return list;
    }

    public void find(int ind,int[] nums,List<Integer> l, List<List<Integer>> list){

        list.add(new ArrayList<>(l));

        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            l.add(nums[i]);
            find(i+1,nums,l,list);
            l.remove(l.size()-1);
        }
    }
}