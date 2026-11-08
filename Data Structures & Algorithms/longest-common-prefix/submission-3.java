class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord = false;
    int prefixOf = 0;
}

class Trie {
    TrieNode base = new TrieNode();

    public void insert(String word) {
        int length = word.length();

        TrieNode current = base;
        current.prefixOf++;

        for (int i = 0; i < length; i++) {
            char currentChar = word.charAt(i);

            if (current.children[currentChar - 'a'] == null) {
                current.children[currentChar - 'a'] = new TrieNode();
            }

            current = current.children[currentChar - 'a'];
            current.prefixOf++;
            if (i == length - 1) {
                current.isEndOfWord = true;
            }
        }
    } 

    public int countOfWordsWithPrefix(String prefix) {
        int length = prefix.length();

        TrieNode current = base;

        for (int i = 0; i < length; i++) {
            char currentChar = prefix.charAt(i);
            current = current.children[currentChar - 'a'];
        }

        return current.prefixOf;
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Trie store = new Trie();

        int noOfWords = strs.length;
        int lengthOfSmallestWord = strs[0].length();
        int indexOfSmallestWord = 0;

        for (int i = 0; i < noOfWords; i++) {
            store.insert(strs[i]);

            if (lengthOfSmallestWord > strs[i].length()) {
                lengthOfSmallestWord = strs[i].length();
                indexOfSmallestWord = i;
            }
        }

        String smallestWord = strs[indexOfSmallestWord];

        for (int i = 0; i < lengthOfSmallestWord; i++) {
            String prefix = smallestWord.substring(0, i + 1);

            if (store.countOfWordsWithPrefix(prefix) == noOfWords && i + 1 == lengthOfSmallestWord) {
                return smallestWord.substring(0, i + 1);
            }
            
            if (store.countOfWordsWithPrefix(prefix) != noOfWords) {
                return smallestWord.substring(0, i);
            }
        }

        return "";
    }
}