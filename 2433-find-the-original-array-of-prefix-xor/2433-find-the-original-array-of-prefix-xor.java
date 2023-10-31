class Solution {
    public int[] findArray(int[] pref) {
        if(pref.length<=1) return pref;
         int[] arr=new int[pref.length];
         arr[0]=pref[0];
         int sum=pref[0];
         for(int i=1;i<pref.length;i++){
             arr[i]=sum^pref[i];
             sum=sum^arr[i];
         }   
         return arr;
    }
}