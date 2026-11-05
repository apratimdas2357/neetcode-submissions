class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> store = new HashMap<>();

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            store.put(nums[i], i);
        }

        int[] indexes = new int[2];

        for (int i = 0; i < length; i++) {
            indexes[0] = i;
            if (store.containsKey(target - nums[i])) {
                if (i == store.get(target - nums[i])) {
                    continue;
                }
                indexes[1] = store.get(target - nums[i]);
                return indexes;
            }
        }

        return null;
    }
}
