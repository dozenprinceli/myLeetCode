package Problem;

public class LeetCode_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res = Math.max(res, right - left);
                left = i + 1;
                right = left;
            } else {
                right++;
            }
        }

        return Math.max(res, right - left);
    }
}
