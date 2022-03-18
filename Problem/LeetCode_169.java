package Problem;

public class LeetCode_169 {
    public int majorityElement(int[] nums) {
        int count = 1, num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            count += (num == nums[i]) ? 1 : -1;

            if (count == 0) {
                num = nums[i];
                count = 1;
            }
        }

        return num;
    }
}
