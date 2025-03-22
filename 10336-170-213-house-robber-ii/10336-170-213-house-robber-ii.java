class Solution {
    public int rob(int[] arr) {
        // code here
        if(arr.length==0) return 0;
        if(arr.length==1) return arr[0];
        if(arr.length==2) return Math.max(arr[0],arr[1]);
        
        int fHouse=rob(arr,0,arr.length-2);
        int lHouse=rob(arr,1,arr.length-1);
        
        return Math.max(fHouse,lHouse);
    }
        
    int rob(int[] arr,int start, int end){
        if(start==end) return arr[start];
        
        int[] dp = new int[arr.length];
        dp[start]=arr[start];
        dp[start+1]=Math.max(arr[start],arr[start+1]);
        
        for(int i=start+2;i<=end;i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }

         return dp[end];        
    }
}