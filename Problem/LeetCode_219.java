package Problem;

public class LeetCode_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // 时间复杂度过高
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= Math.min(i + k, nums.length - 1); j++) {
                if (nums[i] == nums[j]) return true;
            }
        }

        return false;
    }

    // TODO: 优化的解法
}
