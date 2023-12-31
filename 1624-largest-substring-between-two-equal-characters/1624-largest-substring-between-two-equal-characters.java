class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        int[] arr = new int[26];
        int max=-1;
        int max1=-1;
        Arrays.fill(arr,-1);
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==-1)
               arr[s.charAt(i)-'a']=i;
            else {
               max1=i-arr[s.charAt(i)-'a']-1;
               max=Math.max(max1,max);
            }
        }
        return max;
    }
}