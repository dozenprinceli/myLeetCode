package Problem;

public class LeetCode_26 {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                length++;
                continue;
            }

            if (nums[i] != nums[i - 1]) {
                nums[length] = nums[i];
                length++;
            }
        }

        return length;
    }
}
