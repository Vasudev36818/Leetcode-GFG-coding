class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int n = word1.length();
        int m = word2.length();
        String s ="";
        while(i<n || j < m){
            if(i<n)
                s+=word1.charAt(i++);
            if(j<m)
                s+=word2.charAt(j++);
        }
        return s;
    }
}