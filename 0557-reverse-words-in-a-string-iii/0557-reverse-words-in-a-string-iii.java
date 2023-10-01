class Solution {
    public String reverseWords(String str) {
        String[] S=str.split(" ");
        String st="";
        String word="";
        for(String s : S)
        {
            st="";
            for(int j=0;j<s.length();j++)
            {
                st=s.charAt(j)+st;
            }
            word+=st;
            word+=" ";
        }
        return word.trim();
        
    }
}