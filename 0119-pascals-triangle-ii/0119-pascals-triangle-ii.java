class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        if(rowIndex==0){
            list.add(1);
            return list;
        } 
        list.add(1);
        list.add(1);
        if(rowIndex==1) return list;
        for(int i=2;i<=rowIndex;i++){
            List<Integer> list1=new ArrayList();
            list1.add(1);
            for(int j=1;j<i;j++){
                int sum=list.get(j-1)+list.get(j);
                list1.add(sum);
            }
            list1.add(1);
            list=list1;
        }
        return list;
    }
}