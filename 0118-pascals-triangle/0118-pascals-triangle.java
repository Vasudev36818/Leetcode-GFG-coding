class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer=new ArrayList<>();

         List<Integer> list1=new ArrayList<>();
         list1.add(1);
         answer.add(list1);
         for(int i=2;i<=numRows;i++)
         {
             List<Integer> list2=new ArrayList<>();
             list2.add(1);
             for(int j=1;j<list1.size();j++){
                 list2.add( list1.get(j-1)+list1.get(j) );
             }
             list2.add(1);
             answer.add(list2);
             list1=list2;
         }
         return answer;
    }
}