class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0,res=0;
        int[] larr=new int[height.length];
        int[] rarr=new int[height.length];
        for(int i=0;i<height.length;i++)
        {
            lmax=Math.max(lmax,height[i]);
            larr[i]=lmax;
        }
          for(int i=height.length-1;i>=0;i--)
        {
            rmax=Math.max(rmax,height[i]);
            rarr[i]=rmax;
        }
         for(int i=0;i<height.length;i++)
        {
           
            int sum=Math.min(larr[i],rarr[i]);
            if(sum>0)
            res+=(sum-height[i]);
        }
        return res;
        
    }
}