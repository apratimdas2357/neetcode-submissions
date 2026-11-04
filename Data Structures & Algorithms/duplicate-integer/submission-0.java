class Solution {
    public boolean hasDuplicate(int[] nums) {
        int length = nums.length;
        int number;
        for (int i = 0; i < length; i++) {
            number = nums[i];
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (nums[j] == number) {
                    count++;
                }
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }
}