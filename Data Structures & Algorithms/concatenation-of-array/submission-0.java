class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            ans[length + i] = nums[i];
        }
        return ans;
    }
}