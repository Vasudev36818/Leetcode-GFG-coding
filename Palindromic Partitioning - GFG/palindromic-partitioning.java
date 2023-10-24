//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean ispalindrome(String temp){
        int i=0;
        int j=temp.length()-1;
        while(i<=j){
            if(temp.charAt(i)!=temp.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static int f(int i,String s,int[] dp){
        if(i==s.length()){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int mincost=Integer.MAX_VALUE;
        String temp="";
        for(int j=i;j<s.length();j++){
             temp+=s.charAt(j);
            if(ispalindrome(temp)){
               int cost=1+f(j+1,s,dp);
                mincost=Math.min(cost,mincost);
            }
        }
        return  dp[i]=mincost;
    }
    static int palindromicPartition(String str)
    {
        // code here
        int n =str.length();
        int[] dp= new int[n];
        Arrays.fill(dp,-1);
       return f(0,str,dp)-1;
    }
}