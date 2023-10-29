//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        // Your code here
        String sum="";
        while(n>1){
            sum=String.valueOf(n%2)+sum;
            n/=2;
        }
        sum=String.valueOf(n)+sum;
        
        for(int i=sum.length()-1;i>=0;i--){
            if(k==0 && sum.charAt(i)=='1')
            return true;
            else if(k<0) break;
            k--;
        }
        return false;
    }
    
}

//{ Driver Code Starts.

class GFG
{
	static int n;
	static int k;
	
	// Driver Code
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine()); //Inputting the testcases
		
		while(t>0) //While testcases exist
		{
			
			n = Integer.parseInt(br.readLine()); //Input N
			k = Integer.parseInt(br.readLine()); // Input K
			
			CheckBit obj = new CheckBit();
			
			if(obj.checkKthBit(n, k))
				System.out.println("Yes"); //If true, print Yes
				
			else
				System.out.println("No");	// Else print No
            
            t--;
		}
	}
	
	
}
// } Driver Code Ends