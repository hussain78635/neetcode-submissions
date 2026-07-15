class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int left=0, res = Integer.MAX_VALUE;
        for(int right = k-1;right < nums.length;right++){
            res = Math.min((nums[right] - nums[left]), res);
            left++;
        }
        return res;
    }
}