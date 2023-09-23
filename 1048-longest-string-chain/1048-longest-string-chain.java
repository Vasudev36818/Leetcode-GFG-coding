class Solution {
    public int longestStrChain(String[] words) {
        
        Arrays.sort(words,(a,b)->a.length()-b.length());
        
        HashMap<String,Integer> map=new HashMap<>();
        
        int max_length=0;

        for(String word : words)
        {
           int current_length=1;

           for(int i=0;i<word.length();i++)
           {
               StringBuilder pre=new StringBuilder(word);
               pre.deleteCharAt(i);

               if(map.containsKey(pre.toString()))
               {
                   current_length=Math.max(current_length,map.get(pre.toString())+1);
               }
           }
           map.put(word,current_length);
           max_length=Math.max(max_length,current_length);

        }
        return max_length;
        
    }
}