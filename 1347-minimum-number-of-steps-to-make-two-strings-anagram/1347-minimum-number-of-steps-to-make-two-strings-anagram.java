class Solution {
    public int minSteps(String s, String t) {
        int count=0;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++ ){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++){
            count+=Math.abs(arr[i]);
        }
        return count/2;
    }
}