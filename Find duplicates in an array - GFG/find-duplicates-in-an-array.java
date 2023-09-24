//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        
        ArrayList<Integer> set = new ArrayList<>();
        int[] arr1=new int[n];
        
        for(int i=0; i<n; i++) {
            arr1[arr[i]]++;
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr1[i]>1)
            set.add(i);
        }
        if(set.size()==0) set.add(-1);
        return set;
    }
}
