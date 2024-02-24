class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        
        find(0,nums,list,new ArrayList<>());
        return list;
    }
    
   public void find(int i, int[] arr, List<List<Integer>> list, List<Integer> l) {
        if (i == arr.length) {
            list.add(new ArrayList<>(l));
            return;
        }

        l.add(arr[i]);
        find(i + 1, arr, list, l);
        l.remove(l.size() - 1);

        find(i + 1, arr, list, l);
    }
}