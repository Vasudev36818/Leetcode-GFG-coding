class Solution {
    public String frequencySort(String s) {
        // Count the frequency of each character using a HashMap
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Create a custom comparator to sort characters by frequency
        Comparator<Character> frequencyComparator = (ch1, ch2) -> {
            int freq1 = frequencyMap.get(ch1);
            int freq2 = frequencyMap.get(ch2);

            // Sort in decreasing order of frequency
            if (freq1 != freq2) {
                return Integer.compare(freq2, freq1);
            } else {
                // If frequencies are the same, sort in lexicographical order
                return Character.compare(ch1, ch2);
            }
        };

        // Convert the characters to a list and sort them using the custom comparator
        List<Character> characterList = new ArrayList<>(frequencyMap.keySet());
        Collections.sort(characterList, frequencyComparator);

        // Build the sorted string
        StringBuilder sortedString = new StringBuilder();
        for (char ch : characterList) {
            int frequency = frequencyMap.get(ch);
            for (int i = 0; i < frequency; i++) {
                sortedString.append(ch);
            }
        }

        return sortedString.toString();
    }
}