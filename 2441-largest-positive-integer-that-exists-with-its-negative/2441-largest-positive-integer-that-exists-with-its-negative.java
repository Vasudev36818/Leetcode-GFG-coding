class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        int max=Integer.MIN_VALUE;

        for(int i : nums){
            if(i>0 && i>max && set.contains(-i)){
                max=i;
            }
        }
        if(max<0) return -1;
        return max;

    }
}