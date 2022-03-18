package Problem;

public class LeetCode_27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] ^ val) == 0) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }

        return nums.length - count;
    }
}
