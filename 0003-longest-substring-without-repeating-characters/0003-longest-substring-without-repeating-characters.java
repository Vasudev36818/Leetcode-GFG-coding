class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0,len=0;
        HashSet<Character> ch=new HashSet();
        while(i<s.length())
        {
            if(!ch.contains(s.charAt(i)))
            {
                ch.add(s.charAt(i));
                i++;
                max=Math.max(ch.size(),max);
            }
            else
            {
                ch.remove(s.charAt(j));
                j++;
            }
        }
        return max;


        
    }
}