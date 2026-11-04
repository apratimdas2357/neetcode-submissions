class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sTrack = new HashMap<>();
        HashMap<Character, Integer> tTrack = new HashMap<>();

        if (s.equals(t)) {
            return true;
        } else if (s.length() == t.length()) {
            int length = s.length();

            for (int i = 0; i < length; i++) {
                char currentS = s.charAt(i);
                char currentT = t.charAt(i);
                
                if (sTrack.containsKey(currentS)) {
                    sTrack.put(currentS, sTrack.get(currentS) + 1);
                } else {
                    sTrack.put(currentS, 1);
                }
                
                if (tTrack.containsKey(currentT)) {
                    tTrack.put(currentT, tTrack.get(currentT) + 1);
                } else {
                    tTrack.put(currentT, 1);
                }
            }

            for (char item: sTrack.keySet()) {
                if (!(tTrack.containsKey(item))) {
                    return false;
                } else if (!(tTrack.get(item).equals(sTrack.get(item)))) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}
