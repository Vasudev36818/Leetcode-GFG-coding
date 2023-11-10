//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  String s="";
                  for(int i : a){
                      s=String.valueOf(i);
                      int j=0,k=s.length()-1;
                      while(j<k){
                          if(s.charAt(j)!=s.charAt(k)) return 0;
                          j++; k--;
                      }
                  }
                  return 1;
           }
}