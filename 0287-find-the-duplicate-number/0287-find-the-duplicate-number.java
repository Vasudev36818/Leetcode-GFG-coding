class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr=new int[nums.length];
        
        for(int i: nums) { arr[i-1]++; }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>1) return i+1;
        }
        return 0;
    }
}