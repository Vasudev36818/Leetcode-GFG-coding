//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int X = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.nodeLevel(V,list,X));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        int level = 0;
        set.add(0);
        queue.offer(0);
        while(!queue.isEmpty()){
            int n = queue.size();
            while(n-- > 0){
                int cur = queue.poll();
                if(cur == X)
                    return level;
                for(int node: adj.get(cur)){
                    if(!set.contains(node)){
                        queue.offer(node);
                        set.add(node);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}