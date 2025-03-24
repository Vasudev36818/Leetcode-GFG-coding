class Solution {
    public boolean wordPattern(String pattern, String s) {
        int[] arr = new int[26];
        HashMap<String,Integer> map = new HashMap<>();
        String[] str = s.split(" ");

        if(str.length!=pattern.length()) return false;

        for(int i=0;i<str.length;i++){
            if(arr[pattern.charAt(i)-'a']==0 && !map.containsKey(str[i])){
                arr[pattern.charAt(i)-'a']++;
                map.put(str[i],pattern.charAt(i)-'a');
            }
            else if(map.containsKey(str[i]) && (map.get(str[i])!=pattern.charAt(i)-'a')) return false;
            else if(!map.containsKey(str[i])) return false;
        }
         return true;
    }
}