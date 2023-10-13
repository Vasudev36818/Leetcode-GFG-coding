
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] S=s.split("\s+");
        s="";
        for(int i=S.length-1;i>=0;i--)
        {
           s+=S[i];
           s+=" "; 
        }
        s=s.trim();
        return s;
        
    }
}