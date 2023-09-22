//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
        D = D % 16;
        ArrayList<Integer> ans = new ArrayList<>();
        
        // Left rotation
        int num1 = (N << D | N >> (16 - D)) & 65535;
        ans.add(num1);
        
        // Right rotation
        int num2 = (N >> D | N << (16 - D)) & 65535;
        ans.add(num2);
        
        return ans;
    } 
} 