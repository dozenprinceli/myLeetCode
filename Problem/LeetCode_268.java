package Problem;

public class LeetCode_268 {
    public int missingNumber(int[] nums) {
        int res = nums.length * (nums.length + 1) / 2;
        for (int i : nums) {
            res -= i;
        }

        return res;
    }
}
