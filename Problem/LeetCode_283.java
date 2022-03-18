package Problem;

public class LeetCode_283 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i - count] = nums[i];
            } else {
                count++;
            }
        }

        for (int i = nums.length - count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
