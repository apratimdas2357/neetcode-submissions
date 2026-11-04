class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) {
            return true;
        } else if (s.length() == t.length()) {
            int[] sCount = new int[26];
            int[] tCount = new int[26];

            int length = s.length();

            for (int i = 0; i < length; i++) {
                sCount[s.charAt(i) - 'a']++;
                tCount[t.charAt(i) - 'a']++; 
            }

            for (int i =0; i < 26; i++) {
                if (!(sCount[i] == tCount[i])) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}
