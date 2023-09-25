//optimal solution
class Solution {
    public char findTheDifference(String s, String t) {
        int num = 0;
        for(int cs : s.toCharArray()) {
            num -= cs;
        }
        for(int ct : t.toCharArray()) {
            num += ct;
        }
        return (char) (num);
    }
}

//other solution 2nd Approach

/* 
class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0) return t.charAt(0);
        char diff = 0;
        for(int i = 0; i < t.length(); i++){
            diff += t.charAt(i);
        }
        for(int i = 0; i < s.length(); i++){
            diff -= s.charAt(i);
        }
        return diff;
    }
}

*/

//Other solution 3

/*
class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr=new int[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']--;
        }
          for(int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0) return (char)(i+'a');
        }
        return 'a';

    }
}

*/