class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = Math.round(nums.length / 2);

        return nums[n];
    }
}