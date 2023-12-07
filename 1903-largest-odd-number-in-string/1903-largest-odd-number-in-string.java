class Solution {
    public String largestOddNumber(String num) {
        String s="";
        int j=num.length()-1,count=0;
        while(j>=0)
        {
            int value=num.charAt(j)-'0';
            if(value%2!=0)
            break;
            j--;
           count++;
        }
         s=num.substring(0,num.length()-count);
         return s;
    }
}