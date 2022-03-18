package Problem;

public class LeetCode_53 {
    public int maxSubArray(int[] nums) {
        int max = nums[0], pre = 0;
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            max = Math.max(pre, max);
        }

        return max;
    }
}
