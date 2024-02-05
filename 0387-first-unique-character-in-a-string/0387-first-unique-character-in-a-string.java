class Solution {
    public int firstUniqChar(String s) {
        //int count=-1;
        Map<Character,Integer> arr=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                if(arr.containsKey(s.charAt(i)))
                {
                   // int n=arr.get(s.charAt(i));
                   arr.put(s.charAt(i),arr.get(s.charAt(i))+1);
                }
                else
                arr.put(s.charAt(i),1);
            }

            for(int i=0;i<s.length();i++)
            {
                if(arr.get(s.charAt(i))==1)
                return i;
                
            }
        return -1;
        
}
}