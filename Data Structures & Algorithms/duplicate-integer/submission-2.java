class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> tracking = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int current = nums[i];

            if (tracking.containsKey(current)) {
                return true;
            } else {
                tracking.put(current, 1);
            }
        }

        return false;
    }
}