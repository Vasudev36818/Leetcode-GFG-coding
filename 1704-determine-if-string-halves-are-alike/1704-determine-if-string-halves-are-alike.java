class Solution {
    public boolean halvesAreAlike(String s) {
        int vowel=0;
        HashSet<Character> set = new HashSet<>();
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');
        
        for(int i=0;i<s.length()/2;i++){
            if(set.contains(s.charAt(i))) vowel++;
        }

         for(int i=s.length()-1;i>=s.length()/2;i--){
             if(set.contains(s.charAt(i))) vowel--;
        }

        if(vowel==0) return true;
        return false;
    }
}