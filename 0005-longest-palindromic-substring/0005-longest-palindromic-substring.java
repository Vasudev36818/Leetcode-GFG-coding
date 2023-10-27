class Solution{
    public String longestPalindrome(String S){
        // code here
        String ans= "";
        for(int i=0;i<S.length();i++){
            StringBuilder sb = new StringBuilder(String.valueOf(S.charAt(i)));
            for(int j=i+1;j<S.length();j++){
                sb.append(S.charAt(j));
                //System.out.println(i +" - "+j+" sb: "+sb);
                if(sb.length()>ans.length() && isPal(sb) ){
                    ans= sb.toString();
                }
            }
        }
        return (ans.length()==0 ? String.valueOf(S.charAt(0)): ans);
        
    }
    static boolean isPal(StringBuilder sb){
        String s= sb.toString();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}