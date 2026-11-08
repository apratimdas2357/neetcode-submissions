class Solution {
    public String sort(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        String sortedWord = new String(charArray);
        return sortedWord;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagramGroups = new HashMap<>();

        int noOfWords = strs.length;
        for (int i = 0; i < noOfWords; i++) {
            String currentKey = sort(strs[i]);
            if (anagramGroups.containsKey(currentKey)) {
                anagramGroups.get(currentKey).add(strs[i]);
            } else {
                anagramGroups.put(currentKey, new ArrayList<>());
                anagramGroups.get(currentKey).add(strs[i]);
            }
        } 

        List<List<String>> listOfGroups = new ArrayList<>(anagramGroups.values());
        return listOfGroups;
    }
}
