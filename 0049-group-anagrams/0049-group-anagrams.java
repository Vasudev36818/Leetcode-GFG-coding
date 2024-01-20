import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Iterate through each string in the array
        for (String str : strs) {
            // Convert the string to a char array, sort it, and convert it back to a string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            // Check if the sorted string is already in the map
            if (anagramGroups.containsKey(sortedStr)) {
                // If yes, add the original string to the corresponding list
                anagramGroups.get(sortedStr).add(str);
            } else {
                // If no, create a new list with the original string and put it in the map
                List<String> newList = new ArrayList<>();
                newList.add(str);
                anagramGroups.put(sortedStr, newList);
            }
        }

        // Convert the map values to a list of lists
        return new ArrayList<>(anagramGroups.values());
    }
}
