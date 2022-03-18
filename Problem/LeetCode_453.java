package Problem;

public class LeetCode_453 {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(num, min);
        }
        int res = 0;
        for (int num : nums) {
            res += num - min;
        }

        return res;
    }
}
