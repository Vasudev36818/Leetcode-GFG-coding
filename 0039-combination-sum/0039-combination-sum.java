class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> list=new ArrayList<>();
        
        findCombinations(0,candidates,target,list,new ArrayList<>());
        
        return list;
    }
    
    
    public void findCombinations(int index,int[] arr,int target,List<List<Integer>> list,List<Integer> l){
               
        if(index==arr.length){
                if(target==0) list.add(new ArrayList<>(l));
            return;
        }
        
        if(target>=arr[index]){
            l.add(arr[index]);
            findCombinations(index,arr,target-arr[index],list,l);
            l.remove(l.size()-1);
        }
        findCombinations(index+1,arr,target,list,l);
    }
}