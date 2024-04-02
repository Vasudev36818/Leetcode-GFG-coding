class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        else
        {
        HashMap<Character,Character> hashmap=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
             if(hashmap.containsKey(s.charAt(i)))
             {
                 if(hashmap.get(s.charAt(i))!=t.charAt(i))
                 return false;
             }
            else
            {
                if(hashmap.containsValue(t.charAt(i))) 
                return false;  
                hashmap.put(s.charAt(i),t.charAt(i));
            }
        }
        }

        return true;
    }
}